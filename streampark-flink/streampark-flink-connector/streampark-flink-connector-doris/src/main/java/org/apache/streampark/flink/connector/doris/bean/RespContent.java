/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.streampark.flink.connector.doris.bean;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/** Entity returned by streamLoad */
public class RespContent implements Serializable {

  private static final long serialVersionUID = 1L;

  /** Imported transaction ID. The user may not perceive it. */
  @JsonProperty(value = "TxnId")
  private int txnId;
  /** Import Label. Specified by the user or automatically generated by the system. */
  @JsonProperty(value = "Label")
  private String label;
  /**
   * Import complete status. "Success": Indicates that the import was successful. "Publish Timeout":
   * This status also indicates that the import has been completed, but the data may be visible with
   * a delay, and there is no need to retry. "Label Already Exists": The Label is duplicated, and
   * the Label needs to be replaced.
   */
  @JsonProperty(value = "Status")
  private String status;
  /**
   * The status of the import job corresponding to the existing Label. This field will only be
   * displayed when the Status is "Label Already Exists". The user can know the status of the import
   * job corresponding to the existing Label through this status. "RUNNING" means that the job is
   * still executing, and "FINISHED" means that the job is successful.
   */
  @JsonProperty(value = "ExistingJobStatus")
  private String existingJobStatus;
  /** Import error information */
  @JsonProperty(value = "Message")
  private String message;
  /** Import the total number of processed rows */
  @JsonProperty(value = "NumberTotalRows")
  private long numberTotalRows;
  /** The number of rows successfully imported. */
  @JsonProperty(value = "NumberLoadedRows")
  private long numberLoadedRows;
  /** Number of rows with unqualified data quality */
  @JsonProperty(value = "NumberFilteredRows")
  private int numberFilteredRows;
  /** The number of rows filtered by the where condition */
  @JsonProperty(value = "NumberUnselectedRows")
  private int numberUnselectedRows;
  /** Number of bytes imported */
  @JsonProperty(value = "LoadBytes")
  private long loadBytes;
  /** Import completion time. The unit is milliseconds. */
  @JsonProperty(value = "LoadTimeMs")
  private int loadTimeMs;
  /** The time it takes to request Fe to start a transaction, in milliseconds */
  @JsonProperty(value = "BeginTxnTimeMs")
  private int beginTxnTimeMs;
  /** The time it takes to request Fe to obtain the import data execution plan, in milliseconds */
  @JsonProperty(value = "StreamLoadPutTimeMs")
  private int streamLoadPutTimeMs;
  /** The time spent reading data, in milliseconds */
  @JsonProperty(value = "ReadDataTimeMs")
  private int readDataTimeMs;
  /** Time to perform a data write operation takes milliseconds */
  @JsonProperty(value = "WriteDataTimeMs")
  private int writeDataTimeMs;
  /** The time taken to submit and publish the transaction request to Fe, in milliseconds */
  @JsonProperty(value = "CommitAndPublishTimeMs")
  private int commitAndPublishTimeMs;
  /** If there is a data quality problem, check the specific error line by visiting this URL */
  @JsonProperty(value = "ErrorURL")
  private String errorURL;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public int getTxnId() {
    return txnId;
  }

  public void setTxnId(int txnId) {
    this.txnId = txnId;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getExistingJobStatus() {
    return existingJobStatus;
  }

  public void setExistingJobStatus(String existingJobStatus) {
    this.existingJobStatus = existingJobStatus;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public long getNumberTotalRows() {
    return numberTotalRows;
  }

  public void setNumberTotalRows(long numberTotalRows) {
    this.numberTotalRows = numberTotalRows;
  }

  public long getNumberLoadedRows() {
    return numberLoadedRows;
  }

  public void setNumberLoadedRows(long numberLoadedRows) {
    this.numberLoadedRows = numberLoadedRows;
  }

  public int getNumberFilteredRows() {
    return numberFilteredRows;
  }

  public void setNumberFilteredRows(int numberFilteredRows) {
    this.numberFilteredRows = numberFilteredRows;
  }

  public int getNumberUnselectedRows() {
    return numberUnselectedRows;
  }

  public void setNumberUnselectedRows(int numberUnselectedRows) {
    this.numberUnselectedRows = numberUnselectedRows;
  }

  public long getLoadBytes() {
    return loadBytes;
  }

  public void setLoadBytes(long loadBytes) {
    this.loadBytes = loadBytes;
  }

  public int getLoadTimeMs() {
    return loadTimeMs;
  }

  public void setLoadTimeMs(int loadTimeMs) {
    this.loadTimeMs = loadTimeMs;
  }

  public int getBeginTxnTimeMs() {
    return beginTxnTimeMs;
  }

  public void setBeginTxnTimeMs(int beginTxnTimeMs) {
    this.beginTxnTimeMs = beginTxnTimeMs;
  }

  public int getStreamLoadPutTimeMs() {
    return streamLoadPutTimeMs;
  }

  public void setStreamLoadPutTimeMs(int streamLoadPutTimeMs) {
    this.streamLoadPutTimeMs = streamLoadPutTimeMs;
  }

  public int getReadDataTimeMs() {
    return readDataTimeMs;
  }

  public void setReadDataTimeMs(int readDataTimeMs) {
    this.readDataTimeMs = readDataTimeMs;
  }

  public int getWriteDataTimeMs() {
    return writeDataTimeMs;
  }

  public void setWriteDataTimeMs(int writeDataTimeMs) {
    this.writeDataTimeMs = writeDataTimeMs;
  }

  public int getCommitAndPublishTimeMs() {
    return commitAndPublishTimeMs;
  }

  public void setCommitAndPublishTimeMs(int commitAndPublishTimeMs) {
    this.commitAndPublishTimeMs = commitAndPublishTimeMs;
  }

  public String getErrorURL() {
    return errorURL;
  }

  public void setErrorURL(String errorURL) {
    this.errorURL = errorURL;
  }

  @Override
  public String toString() {
    return "RespContent{"
        + "txnId="
        + txnId
        + ", label='"
        + label
        + '\''
        + ", status='"
        + status
        + '\''
        + ", existingJobStatus='"
        + existingJobStatus
        + '\''
        + ", message='"
        + message
        + '\''
        + ", numberTotalRows="
        + numberTotalRows
        + ", numberLoadedRows="
        + numberLoadedRows
        + ", numberFilteredRows="
        + numberFilteredRows
        + ", numberUnselectedRows="
        + numberUnselectedRows
        + ", loadBytes="
        + loadBytes
        + ", loadTimeMs="
        + loadTimeMs
        + ", beginTxnTimeMs="
        + beginTxnTimeMs
        + ", streamLoadPutTimeMs="
        + streamLoadPutTimeMs
        + ", readDataTimeMs="
        + readDataTimeMs
        + ", writeDataTimeMs="
        + writeDataTimeMs
        + ", commitAndPublishTimeMs="
        + commitAndPublishTimeMs
        + ", errorURL='"
        + errorURL
        + '\''
        + '}';
  }
}
