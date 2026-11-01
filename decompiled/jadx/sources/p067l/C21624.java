package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;

/* JADX INFO: renamed from: l.᩶ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21624 {
    public static C7174 descriptor;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor */
    public static final C19244 f68149xbbde3ff9;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable */
    public static final C11650 f68150x2f2e5d77;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_ApexMetadata_descriptor */
    public static final C19244 f68151xc698ea58;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_ApexMetadata_fieldAccessorTable */
    public static final C11650 f68152x570438d6;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor */
    public static final C19244 f68153x2ca282d9;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable */
    public static final C11650 f68154xfc71c057;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor */
    public static final C19244 f68155xf6fef290;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable */
    public static final C11650 f68156x53da890e;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor */
    public static final C19244 f68157x5ee982bf;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable */
    public static final C11650 f68158xe8c57a3d;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor */
    public static final C19244 f68159x4f937aef;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable */
    public static final C11650 f68160x38cc426d;
    public static final C19244 internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable */
    public static final C11650 f68161x568dabbd;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor */
    public static final C19244 f68162x3e2f7e5d;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable */
    public static final C11650 f68163x4e1cf7db;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor */
    public static final C19244 f68164x2a74025b;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable */
    public static final C11650 f68165xd7149dd9;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor */
    public static final C19244 f68166xfb5a5ca0;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable */
    public static final C11650 f68167x6772e31e;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor */
    public static final C19244 f68168x19c8add5;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable */
    public static final C11650 f68169x912b2f53;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_Signatures_descriptor */
    public static final C19244 f68170xdb5fa8e;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_Signatures_fieldAccessorTable */
    public static final C11650 f68171xbe80b30c;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor */
    public static final C19244 f68172x668ec8f1;

    /* JADX INFO: renamed from: internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable */
    public static final C11650 f68173x27226e6f;

    public static void registerAllExtensions(C19283 c19283) {
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C21624.class.getName());
        descriptor = C7174.m16481(new String[]{"\n\u0015update_metadata.proto\u0012\u001ebin.mt.manager.visitor.payload\"1\n\u0006Extent\u0012\u0013\n\u000bstart_block\u0018\u0001 \u0001(\u0004\u0012\u0012\n\nnum_blocks\u0018\u0002 \u0001(\u0004\"§\u0001\n\nSignatures\u0012H\n\nsignatures\u0018\u0001 \u0003(\u000b24.bin.mt.manager.visitor.payload.Signatures.Signature\u001aO\n\tSignature\u0012\u0013\n\u0007version\u0018\u0001 \u0001(\rB\u0002\u0018\u0001\u0012\f\n\u0004data\u0018\u0002 \u0001(\f\u0012\u001f\n\u0017unpadded_signature_size\u0018\u0003 \u0001(\u0007\"+\n\rPartitionInfo\u0012\f\n\u0004size\u0018\u0001 \u0001(\u0004\u0012\f\n\u0004hash\u0018\u0002 \u0001(\f\"Ð\u0004\n\u0010InstallOperation\u0012C\n\u0004type\u0018\u0001 \u0002(\u000e25.bin.mt.manager.visitor.payload.InstallOperation.Type\u0012\u0013\n\u000bdata_offset\u0018\u0002 \u0001(\u0004\u0012\u0013\n\u000bdata_length\u0018\u0003 \u0001(\u0004\u0012;\n\u000bsrc_extents\u0018\u0004 \u0003(\u000b2&.bin.mt.manager.visitor.payload.Extent\u0012\u0012\n\nsrc_length\u0018\u0005 \u0001(\u0004\u0012;\n\u000bdst_extents\u0018\u0006 \u0003(\u000b2&.bin.mt.manager.visitor.payload.Extent\u0012\u0012\n\ndst_length\u0018\u0007 \u0001(\u0004\u0012\u0018\n\u0010data_sha256_hash\u0018\b \u0001(\f\u0012\u0017\n\u000fsrc_sha256_hash\u0018\t \u0001(\f\"÷\u0001\n\u0004Type\u0012\u000b\n\u0007REPLACE\u0010\u0000\u0012\u000e\n\nREPLACE_BZ\u0010\u0001\u0012\f\n\u0004MOVE\u0010\u0002\u001a\u0002\b\u0001\u0012\u000e\n\u0006BSDIFF\u0010\u0003\u001a\u0002\b\u0001\u0012\u000f\n\u000bSOURCE_COPY\u0010\u0004\u0012\u0011\n\rSOURCE_BSDIFF\u0010\u0005\u0012\u000e\n\nREPLACE_XZ\u0010\b\u0012\b\n\u0004ZERO\u0010\u0006\u0012\u000b\n\u0007DISCARD\u0010\u0007\u0012\u0011\n\rBROTLI_BSDIFF\u0010\n\u0012\f\n\bPUFFDIFF\u0010\t\u0012\f\n\bZUCCHINI\u0010\u000b\u0012\u0012\n\u000eLZ4DIFF_BSDIFF\u0010\f\u0012\u0014\n\u0010LZ4DIFF_PUFFDIFF\u0010\r\u0012\u0010\n\fREPLACE_ZSTD\u0010\u000e\"\u0099\u0002\n\u0011CowMergeOperation\u0012D\n\u0004type\u0018\u0001 \u0001(\u000e26.bin.mt.manager.visitor.payload.CowMergeOperation.Type\u0012:\n\nsrc_extent\u0018\u0002 \u0001(\u000b2&.bin.mt.manager.visitor.payload.Extent\u0012:\n\ndst_extent\u0018\u0003 \u0001(\u000b2&.bin.mt.manager.visitor.payload.Extent\u0012\u0012\n\nsrc_offset\u0018\u0004 \u0001(\r\"2\n\u0004Type\u0012\f\n\bCOW_COPY\u0010\u0000\u0012\u000b\n\u0007COW_XOR\u0010\u0001\u0012\u000f\n\u000bCOW_REPLACE\u0010\u0002\"¯\u0007\n\u000fPartitionUpdate\u0012\u0016\n\u000epartition_name\u0018\u0001 \u0002(\t\u0012\u0017\n\u000frun_postinstall\u0018\u0002 \u0001(\b\u0012\u0018\n\u0010postinstall_path\u0018\u0003 \u0001(\t\u0012\u0017\n\u000ffilesystem_type\u0018\u0004 \u0001(\t\u0012U\n\u0017new_partition_signature\u0018\u0005 \u0003(\u000b24.bin.mt.manager.visitor.payload.Signatures.Signature\u0012I\n\u0012old_partition_info\u0018\u0006 \u0001(\u000b2-.bin.mt.manager.visitor.payload.PartitionInfo\u0012I\n\u0012new_partition_info\u0018\u0007 \u0001(\u000b2-.bin.mt.manager.visitor.payload.PartitionInfo\u0012D\n\noperations\u0018\b \u0003(\u000b20.bin.mt.manager.visitor.payload.InstallOperation\u0012\u001c\n\u0014postinstall_optional\u0018\t \u0001(\b\u0012E\n\u0015hash_tree_data_extent\u0018\n \u0001(\u000b2&.bin.mt.manager.visitor.payload.Extent\u0012@\n\u0010hash_tree_extent\u0018\u000b \u0001(\u000b2&.bin.mt.manager.visitor.payload.Extent\u0012\u001b\n\u0013hash_tree_algorithm\u0018\f \u0001(\t\u0012\u0016\n\u000ehash_tree_salt\u0018\r \u0001(\f\u0012?\n\u000ffec_data_extent\u0018\u000e \u0001(\u000b2&.bin.mt.manager.visitor.payload.Extent\u0012:\n\nfec_extent\u0018\u000f \u0001(\u000b2&.bin.mt.manager.visitor.payload.Extent\u0012\u0014\n\tfec_roots\u0018\u0010 \u0001(\r:\u00012\u0012\u000f\n\u0007version\u0018\u0011 \u0001(\t\u0012K\n\u0010merge_operations\u0018\u0012 \u0003(\u000b21.bin.mt.manager.visitor.payload.CowMergeOperation\u0012\u0019\n\u0011estimate_cow_size\u0018\u0013 \u0001(\u0004\u0012\u001d\n\u0015estimate_op_count_max\u0018\u0014 \u0001(\u0004\"L\n\u0015DynamicPartitionGroup\u0012\f\n\u0004name\u0018\u0001 \u0002(\t\u0012\f\n\u0004size\u0018\u0002 \u0001(\u0004\u0012\u0017\n\u000fpartition_names\u0018\u0003 \u0003(\t\"8\n\u000eVABCFeatureSet\u0012\u0010\n\bthreaded\u0018\u0001 \u0001(\b\u0012\u0014\n\fbatch_writes\u0018\u0002 \u0001(\b\"¬\u0002\n\u0018DynamicPartitionMetadata\u0012E\n\u0006groups\u0018\u0001 \u0003(\u000b25.bin.mt.manager.visitor.payload.DynamicPartitionGroup\u0012\u0018\n\u0010snapshot_enabled\u0018\u0002 \u0001(\b\u0012\u0014\n\fvabc_enabled\u0018\u0003 \u0001(\b\u0012\u001e\n\u0016vabc_compression_param\u0018\u0004 \u0001(\t\u0012\u0013\n\u000bcow_version\u0018\u0005 \u0001(\r\u0012H\n\u0010vabc_feature_set\u0018\u0006 \u0001(\u000b2..bin.mt.manager.visitor.payload.VABCFeatureSet\u0012\u001a\n\u0012compression_factor\u0018\u0007 \u0001(\u0004\"c\n\bApexInfo\u0012\u0014\n\fpackage_name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007version\u0018\u0002 \u0001(\u0003\u0012\u0015\n\ris_compressed\u0018\u0003 \u0001(\b\u0012\u0019\n\u0011decompressed_size\u0018\u0004 \u0001(\u0003\"K\n\fApexMetadata\u0012;\n\tapex_info\u0018\u0001 \u0003(\u000b2(.bin.mt.manager.visitor.payload.ApexInfo\"Û\u0003\n\u0014DeltaArchiveManifest\u0012\u0018\n\nblock_size\u0018\u0003 \u0001(\r:\u00044096\u0012\u0019\n\u0011signatures_offset\u0018\u0004 \u0001(\u0004\u0012\u0017\n\u000fsignatures_size\u0018\u0005 \u0001(\u0004\u0012\u0018\n\rminor_version\u0018\f \u0001(\r:\u00010\u0012C\n\npartitions\u0018\r \u0003(\u000b2/.bin.mt.manager.visitor.payload.PartitionUpdate\u0012\u0015\n\rmax_timestamp\u0018\u000e \u0001(\u0003\u0012\\\n\u001adynamic_partition_metadata\u0018\u000f \u0001(\u000b28.bin.mt.manager.visitor.payload.DynamicPartitionMetadata\u0012\u0016\n\u000epartial_update\u0018\u0010 \u0001(\b\u0012;\n\tapex_info\u0018\u0011 \u0003(\u000b2(.bin.mt.manager.visitor.payload.ApexInfo\u0012\u001c\n\u0014security_patch_level\u0018\u0012 \u0001(\tJ\u0004\b\u0001\u0010\u0002J\u0004\b\u0002\u0010\u0003J\u0004\b\u0006\u0010\u0007J\u0004\b\u0007\u0010\bJ\u0004\b\b\u0010\tJ\u0004\b\t\u0010\nJ\u0004\b\n\u0010\u000bJ\u0004\b\u000b\u0010\f"}, new C7174[0]);
        C19244 c19244 = (C19244) getDescriptor().m16485().get(0);
        internal_static_bin_mt_manager_visitor_payload_Extent_descriptor = c19244;
        f68161x568dabbd = new C11650(c19244, new String[]{"StartBlock", "NumBlocks"});
        C19244 c19245 = (C19244) getDescriptor().m16485().get(1);
        f68170xdb5fa8e = c19245;
        f68171xbe80b30c = new C11650(c19245, new String[]{"Signatures"});
        C19244 c19246 = (C19244) c19245.m43837().get(0);
        f68168x19c8add5 = c19246;
        f68169x912b2f53 = new C11650(c19246, new String[]{AbstractC0213e.f983g, "Data", "UnpaddedSignatureSize"});
        C19244 c19247 = (C19244) getDescriptor().m16485().get(2);
        f68164x2a74025b = c19247;
        f68165xd7149dd9 = new C11650(c19247, new String[]{"Size", "Hash"});
        C19244 c19248 = (C19244) getDescriptor().m16485().get(3);
        f68162x3e2f7e5d = c19248;
        f68163x4e1cf7db = new C11650(c19248, new String[]{"Type", "DataOffset", "DataLength", "SrcExtents", "SrcLength", "DstExtents", "DstLength", "DataSha256Hash", "SrcSha256Hash"});
        C19244 c19249 = (C19244) getDescriptor().m16485().get(4);
        f68153x2ca282d9 = c19249;
        f68154xfc71c057 = new C11650(c19249, new String[]{"Type", "SrcExtent", "DstExtent", "SrcOffset"});
        C19244 c192410 = (C19244) getDescriptor().m16485().get(5);
        f68166xfb5a5ca0 = c192410;
        f68167x6772e31e = new C11650(c192410, new String[]{"PartitionName", "RunPostinstall", "PostinstallPath", "FilesystemType", "NewPartitionSignature", "OldPartitionInfo", "NewPartitionInfo", "Operations", "PostinstallOptional", "HashTreeDataExtent", "HashTreeExtent", "HashTreeAlgorithm", "HashTreeSalt", "FecDataExtent", "FecExtent", "FecRoots", AbstractC0213e.f983g, "MergeOperations", "EstimateCowSize", "EstimateOpCountMax"});
        C19244 c192411 = (C19244) getDescriptor().m16485().get(6);
        f68157x5ee982bf = c192411;
        f68158xe8c57a3d = new C11650(c192411, new String[]{"Name", "Size", "PartitionNames"});
        C19244 c192412 = (C19244) getDescriptor().m16485().get(7);
        f68172x668ec8f1 = c192412;
        f68173x27226e6f = new C11650(c192412, new String[]{"Threaded", "BatchWrites"});
        C19244 c192413 = (C19244) getDescriptor().m16485().get(8);
        f68159x4f937aef = c192413;
        f68160x38cc426d = new C11650(c192413, new String[]{"Groups", "SnapshotEnabled", "VabcEnabled", "VabcCompressionParam", "CowVersion", "VabcFeatureSet", "CompressionFactor"});
        C19244 c192414 = (C19244) getDescriptor().m16485().get(9);
        f68149xbbde3ff9 = c192414;
        f68150x2f2e5d77 = new C11650(c192414, new String[]{"PackageName", AbstractC0213e.f983g, "IsCompressed", "DecompressedSize"});
        C19244 c192415 = (C19244) getDescriptor().m16485().get(10);
        f68151xc698ea58 = c192415;
        f68152x570438d6 = new C11650(c192415, new String[]{"ApexInfo"});
        C19244 c192416 = (C19244) getDescriptor().m16485().get(11);
        f68155xf6fef290 = c192416;
        f68156x53da890e = new C11650(c192416, new String[]{"BlockSize", "SignaturesOffset", "SignaturesSize", "MinorVersion", "Partitions", "MaxTimestamp", "DynamicPartitionMetadata", "PartialUpdate", "ApexInfo", "SecurityPatchLevel"});
        descriptor.m16491();
    }

    public static void registerAllExtensions(C3860 c3860) {
        registerAllExtensions((C19283) c3860);
    }

    public static C7174 getDescriptor() {
        return descriptor;
    }
}
