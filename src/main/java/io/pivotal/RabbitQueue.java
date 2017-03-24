package io.pivotal;

import java.util.List;
import java.util.Map;

public class RabbitQueue {

	Float memory;
	
	Float reductions;
	
	Map<String, Float> reduction_details;
	
	Float messages_ready;
	
	Map<String, Float> messages_ready_details;
	
	Float messages_unacknowledged;
	
	Map<String, Float> messages_unacknowledged_details;
	
	String idle_since;
	
	Float consumer_utilization;
	
	String policy;
	
	String exclusive_consumer_tag;
	
	Float consumers;
	
	List<String> slave_nodes;
	
	List<String> synchronized_slave_nodes;
	
	List<String> recoverable_slave_nodes;
	
	String state;
	
	/* Float reductions; Rabbit give this twice */
	
	Map<String, Float> garbage_collection;

    Integer messages_ram;
    Integer messages_ready_ram;
    Integer messages_unacknowledged_ram;
    Integer messages_persistent;
    Integer message_bytes;
    Integer message_bytes_ready;
    Integer message_bytes_unacknowledged;
    Integer message_bytes_ram;
    Integer message_bytes_persistent;
    String head_message_timestamp;
    Integer disk_reads;
    Integer disk_writes;
    RabbitQueueStatus backing_queue_status;
    String node;
    Map<String, Object> arguments;
    Boolean exclusive;
    Boolean auto_delete;
    Boolean durable;
    String vhost;
    String name;
	public Float getMemory() {
		return memory;
	}
	public void setMemory(Float memory) {
		this.memory = memory;
	}
	public Float getReductions() {
		return reductions;
	}
	public void setReductions(Float reductions) {
		this.reductions = reductions;
	}
	public Map<String, Float> getReduction_details() {
		return reduction_details;
	}
	public void setReduction_details(Map<String, Float> reduction_details) {
		this.reduction_details = reduction_details;
	}
	public Float getMessages_ready() {
		return messages_ready;
	}
	public void setMessages_ready(Float messages_ready) {
		this.messages_ready = messages_ready;
	}
	public Map<String, Float> getMessages_ready_details() {
		return messages_ready_details;
	}
	public void setMessages_ready_details(Map<String, Float> messages_ready_details) {
		this.messages_ready_details = messages_ready_details;
	}
	public Float getMessages_unacknowledged() {
		return messages_unacknowledged;
	}
	public void setMessages_unacknowledged(Float messages_unacknowledged) {
		this.messages_unacknowledged = messages_unacknowledged;
	}
	public Map<String, Float> getMessages_unacknowledged_details() {
		return messages_unacknowledged_details;
	}
	public void setMessages_unacknowledged_details(Map<String, Float> messages_unacknowledged_details) {
		this.messages_unacknowledged_details = messages_unacknowledged_details;
	}
	public String getIdle_since() {
		return idle_since;
	}
	public void setIdle_since(String idle_since) {
		this.idle_since = idle_since;
	}
	public Float getConsumer_utilization() {
		return consumer_utilization;
	}
	public void setConsumer_utilization(Float consumer_utilization) {
		this.consumer_utilization = consumer_utilization;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public String getExclusive_consumer_tag() {
		return exclusive_consumer_tag;
	}
	public void setExclusive_consumer_tag(String exclusive_consumer_tag) {
		this.exclusive_consumer_tag = exclusive_consumer_tag;
	}
	public Float getConsumers() {
		return consumers;
	}
	public void setConsumers(Float consumers) {
		this.consumers = consumers;
	}
	public List<String> getSlave_nodes() {
		return slave_nodes;
	}
	public void setSlave_nodes(List<String> slave_nodes) {
		this.slave_nodes = slave_nodes;
	}
	public List<String> getSynchronized_slave_nodes() {
		return synchronized_slave_nodes;
	}
	public void setSynchronized_slave_nodes(List<String> synchronized_slave_nodes) {
		this.synchronized_slave_nodes = synchronized_slave_nodes;
	}
	public List<String> getRecoverable_slave_nodes() {
		return recoverable_slave_nodes;
	}
	public void setRecoverable_slave_nodes(List<String> recoverable_slave_nodes) {
		this.recoverable_slave_nodes = recoverable_slave_nodes;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Map<String, Float> getGarbage_collection() {
		return garbage_collection;
	}
	public void setGarbage_collection(Map<String, Float> garbage_collection) {
		this.garbage_collection = garbage_collection;
	}
	public Integer getMessages_ram() {
		return messages_ram;
	}
	public void setMessages_ram(Integer messages_ram) {
		this.messages_ram = messages_ram;
	}
	public Integer getMessages_ready_ram() {
		return messages_ready_ram;
	}
	public void setMessages_ready_ram(Integer messages_ready_ram) {
		this.messages_ready_ram = messages_ready_ram;
	}
	public Integer getMessages_unacknowledged_ram() {
		return messages_unacknowledged_ram;
	}
	public void setMessages_unacknowledged_ram(Integer messages_unacknowledged_ram) {
		this.messages_unacknowledged_ram = messages_unacknowledged_ram;
	}
	public Integer getMessages_persistent() {
		return messages_persistent;
	}
	public void setMessages_persistent(Integer messages_persistent) {
		this.messages_persistent = messages_persistent;
	}
	public Integer getMessage_bytes() {
		return message_bytes;
	}
	public void setMessage_bytes(Integer message_bytes) {
		this.message_bytes = message_bytes;
	}
	public Integer getMessage_bytes_ready() {
		return message_bytes_ready;
	}
	public void setMessage_bytes_ready(Integer message_bytes_ready) {
		this.message_bytes_ready = message_bytes_ready;
	}
	public Integer getMessage_bytes_unacknowledged() {
		return message_bytes_unacknowledged;
	}
	public void setMessage_bytes_unacknowledged(Integer message_bytes_unacknowledged) {
		this.message_bytes_unacknowledged = message_bytes_unacknowledged;
	}
	public Integer getMessage_bytes_ram() {
		return message_bytes_ram;
	}
	public void setMessage_bytes_ram(Integer message_bytes_ram) {
		this.message_bytes_ram = message_bytes_ram;
	}
	public Integer getMessage_bytes_persistent() {
		return message_bytes_persistent;
	}
	public void setMessage_bytes_persistent(Integer message_bytes_persistent) {
		this.message_bytes_persistent = message_bytes_persistent;
	}
	public String getHead_message_timestamp() {
		return head_message_timestamp;
	}
	public void setHead_message_timestamp(String head_message_timestamp) {
		this.head_message_timestamp = head_message_timestamp;
	}
	public Integer getDisk_reads() {
		return disk_reads;
	}
	public void setDisk_reads(Integer disk_reads) {
		this.disk_reads = disk_reads;
	}
	public Integer getDisk_writes() {
		return disk_writes;
	}
	public void setDisk_writes(Integer disk_writes) {
		this.disk_writes = disk_writes;
	}
	public RabbitQueueStatus getBacking_queue_status() {
		return backing_queue_status;
	}
	public void setBacking_queue_status(RabbitQueueStatus backing_queue_status) {
		this.backing_queue_status = backing_queue_status;
	}
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	public Map<String, Object> getArguments() {
		return arguments;
	}
	public void setArguments(Map<String, Object> arguments) {
		this.arguments = arguments;
	}
	public Boolean getExclusive() {
		return exclusive;
	}
	public void setExclusive(Boolean exclusive) {
		this.exclusive = exclusive;
	}
	public Boolean getAuto_delete() {
		return auto_delete;
	}
	public void setAuto_delete(Boolean auto_delete) {
		this.auto_delete = auto_delete;
	}
	public Boolean getDurable() {
		return durable;
	}
	public void setDurable(Boolean durable) {
		this.durable = durable;
	}
	public String getVhost() {
		return vhost;
	}
	public void setVhost(String vhost) {
		this.vhost = vhost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    
}
