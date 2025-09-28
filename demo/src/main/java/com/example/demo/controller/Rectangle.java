package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("rectangle")
public class Rectangle implements Shape {

}
