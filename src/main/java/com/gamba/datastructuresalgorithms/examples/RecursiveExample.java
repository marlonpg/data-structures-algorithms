package com.gamba.datastructuresalgorithms.examples;

import java.util.ArrayList;
import java.util.List;

public class RecursiveExample {
    public static void main(String[] args) {
        System.out.println(getLinks("URL", 2));
    }

    public static List<String> getLinks(String URL, int depth) {
        var links = generateLinks("link", 0);
        System.out.println(links);
        var totalLinks = new ArrayList<String>();
        totalLinks.addAll(links);
        aggregateLinks(totalLinks, links, depth, 0);
        return totalLinks;
    }

    public static void aggregateLinks(List<String> totalLinks, List<String> links, int maxDepth, int currentDepth) {
        currentDepth += 1;
        if (currentDepth <= maxDepth) {
            for (int counter = 0; counter < links.size(); counter++) {
                var nestedLinks = generateLinks(links.get(counter), currentDepth);
                System.out.println(nestedLinks);
                totalLinks.addAll(nestedLinks);
                aggregateLinks(totalLinks, nestedLinks, maxDepth, currentDepth);
            }
        }
    }

    public static List<String> generateLinks(String page, int currentDepth) {
        return List.of(page + "-1-" + currentDepth, page + "-2-" + currentDepth);
    }
}
