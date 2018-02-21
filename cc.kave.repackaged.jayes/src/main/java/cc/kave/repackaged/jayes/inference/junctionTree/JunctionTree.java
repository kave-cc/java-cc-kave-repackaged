/**
 * Copyright (c) 2011 Michael Kutschke.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Kutschke - initial API and implementation.
 */
package cc.kave.repackaged.jayes.inference.junctionTree;

import java.util.List;

import cc.kave.repackaged.jayes.util.Graph;
import cc.kave.repackaged.jayes.util.Pair;
import cc.kave.repackaged.jayes.util.Graph.Edge;

public class JunctionTree {
    private List<List<Integer>> clusters;
    private List<Pair<Edge, List<Integer>>> sepSets;
    private Graph junctionTreeGraph;

    public JunctionTree(Graph junctionTree) {
        this.junctionTreeGraph = junctionTree;
    }

    public List<List<Integer>> getClusters() {
        return clusters;
    }

    public void setClusters(List<List<Integer>> clusters) {
        this.clusters = clusters;
        junctionTreeGraph.initialize(clusters.size());
    }

    public List<Pair<Edge, List<Integer>>> getSepSets() {
        return sepSets;
    }

    public void setSepSets(List<Pair<Edge, List<Integer>>> sepSets) {
        this.sepSets = sepSets;
    }

    public Graph getGraph() {
        return junctionTreeGraph;
    }
}
