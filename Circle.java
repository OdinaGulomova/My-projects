package com.epam.rd.autotasks.figures;

class Circle extends com.epam.rd.autotasks.figures.Figure {
    private final com.epam.rd.autotasks.figures.Point centre;
    private final double radius;

    public Circle(com.epam.rd.autotasks.figures.Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String pointsToString() {
        return centre.toString();
    }

    @Override
    public String toString() {
        return String.format("Circle[" + pointsToString() 
         + radius + "]");
    }

    @Override
    public com.epam.rd.autotasks.figures.Point leftmostPoint() {
        return new com.epam.rd.autotasks.figures.Point(centre.getX() - radius, centre.getY());
    }
}
