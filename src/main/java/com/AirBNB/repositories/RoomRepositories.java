package com.AirBNB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AirBNB.entity.Room;

@Repository
public interface RoomRepositories extends JpaRepository<Room, Long>
{

}
