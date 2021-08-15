package com.dobby.board_0815.service;

import com.dobby.board_0815.model.Board;
import com.dobby.board_0815.model.User;
import com.dobby.board_0815.repository.BoardRepository;
import com.dobby.board_0815.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }

}
