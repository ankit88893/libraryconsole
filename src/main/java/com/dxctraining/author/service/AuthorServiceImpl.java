package com.dxctraining.author.service;
import com.dxctraining.author.dao.*;
import com.dxctraining.author.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AuthorServiceImpl implements IAuthorService {

    @Autowired
    private IAuthorDao authorDao;

    @Override
    public Author add(Author author) {
        author=authorDao.add(author);
        return author;
    }
}
