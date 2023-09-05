package com.AlbersSoftware.Contentcreatorcalendar.repository;

import com.AlbersSoftware.Contentcreatorcalendar.model.Content;
import com.AlbersSoftware.Contentcreatorcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {

    List<Content> findAllByTitleContains(String keyword);
    List<Content> findAllByContentType(String type);

    @Query(""" 
        SELECT  * FROM  Content
        where  status = :status
""")
    List<Content> listByStatus(@Param("status") Status status);
}
