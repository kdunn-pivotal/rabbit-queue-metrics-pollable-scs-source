package io.pivotal;

import java.util.List;

public class RabbitQueueStatus {
    String mode;
    Integer q1;
    Integer q2;
    List<Object> delta;
    Integer q3;
    Integer q4;
    Integer len;
    String target_ram_count;
    Integer next_seq_id;
    Float avg_ingress_rate;
    Float avg_egress_rate;
    Float avg_ack_ingress_rate;
    Float avg_ack_egress_rate;
    Integer mirror_seen;
    Integer mirror_senders;
    
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public Integer getQ1() {
		return q1;
	}
	public void setQ1(Integer q1) {
		this.q1 = q1;
	}
	public Integer getQ2() {
		return q2;
	}
	public void setQ2(Integer q2) {
		this.q2 = q2;
	}
	public List<Object> getDelta() {
		return delta;
	}
	public void setDelta(List<Object> delta) {
		this.delta = delta;
	}
	public Integer getQ3() {
		return q3;
	}
	public void setQ3(Integer q3) {
		this.q3 = q3;
	}
	public Integer getQ4() {
		return q4;
	}
	public void setQ4(Integer q4) {
		this.q4 = q4;
	}
	public Integer getLen() {
		return len;
	}
	public void setLen(Integer len) {
		this.len = len;
	}
	public String getTarget_ram_count() {
		return target_ram_count;
	}
	public void setTarget_ram_count(String target_ram_count) {
		this.target_ram_count = target_ram_count;
	}
	public Integer getNext_seq_id() {
		return next_seq_id;
	}
	public void setNext_seq_id(Integer next_seq_id) {
		this.next_seq_id = next_seq_id;
	}
	public Float getAvg_ingress_rate() {
		return avg_ingress_rate;
	}
	public void setAvg_ingress_rate(Float avg_ingress_rate) {
		this.avg_ingress_rate = avg_ingress_rate;
	}
	public Float getAvg_egress_rate() {
		return avg_egress_rate;
	}
	public void setAvg_egress_rate(Float avg_egress_rate) {
		this.avg_egress_rate = avg_egress_rate;
	}
	public Float getAvg_ack_ingress_rate() {
		return avg_ack_ingress_rate;
	}
	public void setAvg_ack_ingress_rate(Float avg_ack_ingress_rate) {
		this.avg_ack_ingress_rate = avg_ack_ingress_rate;
	}
	public Float getAvg_ack_egress_rate() {
		return avg_ack_egress_rate;
	}
	public void setAvg_ack_egress_rate(Float avg_ack_egress_rate) {
		this.avg_ack_egress_rate = avg_ack_egress_rate;
	}
	public Integer getMirror_seen() {
		return mirror_seen;
	}
	public void setMirror_seen(Integer mirror_seen) {
		this.mirror_seen = mirror_seen;
	}
	public Integer getMirror_senders() {
		return mirror_senders;
	}
	public void setMirror_senders(Integer mirror_senders) {
		this.mirror_senders = mirror_senders;
	}
    
    
}
