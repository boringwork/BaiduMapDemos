package com.mustodo.bmap.demos;

public class JiDi {
    public Feature[] features;

    public static class Feature{
        public Geometry geometry;

        public static class Geometry{
            double [][][] rings;
        }
    }
}
