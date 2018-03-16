package de.evoila.cf.broker.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by reneschollmeyer, evoila on 16.03.18.
 */
public class Metadata {

    private int connections;

    private int nodes;

    private String vm_type;

    private String persistent_disk_type;

    private List<NetworkReference> networks;

    private Map<String, Metadata> instanceGroupMetadata;

    private Map<String, Object> customParameters;

    public Metadata() {}

    public Metadata(int connections, int nodes, String vm_type, String persistent_disk_type, List<NetworkReference> networks,
                    Map<String, Metadata> instanceGroupMetadata, Map<String, Object> customParameters) {
        this.connections = connections;
        this.nodes = nodes;
        this.vm_type = vm_type;
        this.persistent_disk_type = persistent_disk_type;
        this.networks = networks;
        setInstanceGroupMetadata(instanceGroupMetadata);
        setCustomParameters(customParameters);
    }

    public int getConnections() {
        return connections;
    }

    public void setConnections(int connections) {
        this.connections = connections;
    }

    public int getNodes() {
        return nodes;
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

    public String getVm_type() {
        return vm_type;
    }

    public void setVm_type(String vm_type) {
        this.vm_type = vm_type;
    }

    public String getPersistent_disk_type() {
        return persistent_disk_type;
    }

    public void setPersistent_disk_type(String persistent_disk_type) {
        this.persistent_disk_type = persistent_disk_type;
    }

    public List<NetworkReference> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NetworkReference> networks) {
        this.networks = networks;
    }

    public Map<String, Metadata> getInstanceGroupMetadata() {
        return instanceGroupMetadata;
    }

    public void setInstanceGroupMetadata(Map<String, Metadata> instanceGroupMetadata) {
        if(instanceGroupMetadata != null) {
            this.instanceGroupMetadata = instanceGroupMetadata;
        } else {
            this.instanceGroupMetadata = new HashMap<>();
        }
    }

    public Map<String, Object> getCustomParameters() {
        return customParameters;
    }

    public void setCustomParameters(Map<String, Object> customParameters) {
        if(customParameters != null) {
            this.customParameters = customParameters;
        } else {
            this.customParameters = new HashMap<>();
        }
    }
}
