package com.PhysicsFinder.demo.DTO;

import com.PhysicsFinder.demo.entities.AttributeName;

import java.util.List;

public record ApplyAttributeBoostRequest(List<AttributeName> ancestryBoosts, List<AttributeName> ancestryFlaws, List<AttributeName> backgroundBoosts, List<AttributeName> classBoosts, List<AttributeName> freeBoosts) {
}
