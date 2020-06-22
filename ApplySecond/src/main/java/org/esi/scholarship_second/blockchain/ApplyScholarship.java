package org.esi.scholarship_second.blockchain;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class ApplyScholarship extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b5061054b806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063255450631461003b57806384f5e97d14610277575b600080fd5b610275600480360360a081101561005157600080fd5b81359190810190604081016020820135600160201b81111561007257600080fd5b82018360208201111561008457600080fd5b803590602001918460018302840111600160201b831117156100a557600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b8111156100f757600080fd5b82018360208201111561010957600080fd5b803590602001918460018302840111600160201b8311171561012a57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561017c57600080fd5b82018360208201111561018e57600080fd5b803590602001918460018302840111600160201b831117156101af57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561020157600080fd5b82018360208201111561021357600080fd5b803590602001918460018302840111600160201b8311171561023457600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955061032d945050505050565b005b61031b6004803603602081101561028d57600080fd5b810190602081018135600160201b8111156102a757600080fd5b8201836020820111156102b957600080fd5b803590602001918460018302840111600160201b831117156102da57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506103e0945050505050565b60408051918252519081900360200190f35b600085815260208181526040808320815160808101835288815280840188905291820186905260608201859052805460018101825590845292829020815180519294600402909101926103859284929091019061047a565b50602082810151805161039e926001850192019061047a565b50604082015180516103ba91600284019160209091019061047a565b50606082015180516103d691600384019160209091019061047a565b5050505050505050565b600081426040516020018080602001838152602001828103825284818151815260200191508051906020019080838360005b8381101561042a578181015183820152602001610412565b50505050905090810190601f1680156104575780820380516001836020036101000a031916815260200191505b5060408051808303601f1901815291905280516020909101209695505050505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106104bb57805160ff19168380011785556104e8565b828001600101855582156104e8579182015b828111156104e85782518255916020019190600101906104cd565b506104f49291506104f8565b5090565b61051291905b808211156104f457600081556001016104fe565b9056fea264697066735822122092454813de71acafa1f4a0be35a2954bcd2e27a87d5002245eeccdc02c1de28c64736f6c634300060a0033";

    public static final String FUNC_CREATECOLLABORATION = "createCollaboration";

    public static final String FUNC_REGISTERACTIVITY = "registerActivity";

    @Deprecated
    protected ApplyScholarship(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ApplyScholarship(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ApplyScholarship(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ApplyScholarship(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<byte[]> createCollaboration(String businessKey) {
        final Function function = new Function(FUNC_CREATECOLLABORATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(businessKey)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<TransactionReceipt> registerActivity(byte[] instanceID, String businessKey, String taskName, String executor, String additionalInfo) {
        final Function function = new Function(
                FUNC_REGISTERACTIVITY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(instanceID), 
                new org.web3j.abi.datatypes.Utf8String(businessKey), 
                new org.web3j.abi.datatypes.Utf8String(taskName), 
                new org.web3j.abi.datatypes.Utf8String(executor), 
                new org.web3j.abi.datatypes.Utf8String(additionalInfo)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static ApplyScholarship load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ApplyScholarship(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ApplyScholarship load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ApplyScholarship(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ApplyScholarship load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ApplyScholarship(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ApplyScholarship load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ApplyScholarship(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ApplyScholarship> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ApplyScholarship.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ApplyScholarship> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ApplyScholarship.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<ApplyScholarship> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ApplyScholarship.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ApplyScholarship> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ApplyScholarship.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
