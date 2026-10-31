.class public final Ll/᩻᩵ۖ;
.super Ljava/lang/Object;
.source "U940"


# static fields
.field public static final ֫:Ll/ᩳۖۖ;

.field public static final ۧ:Ll/ۢᩴۖ;

.field public static final ܽ:Ll/ܺᩴۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 11
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/᩻᩵ۖ;

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 722
    const-class v0, Ll/ܳ᩵ۖ;

    .line 725
    invoke-static {}, Ll/ܳ᩵ۖ;->getDefaultInstance()Ll/ܳ᩵ۖ;

    move-result-object v1

    .line 723
    invoke-static {v0, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ll/᩻֡ۖ;)Ll/ܺᩴۖ;

    move-result-object v0

    sput-object v0, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    const-string v1, "\n#google/protobuf/java_features.proto\u0012\u0002pb\u001a google/protobuf/descriptor.proto\"\u0099\u0005\n\u000cJavaFeatures\u0012\u008e\u0002\n\u0012legacy_closed_enum\u0018\u0001 \u0001(\u0008B\u00df\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001\u00a2\u0001\t\u0012\u0004true\u0018\u00e6\u0007\u00a2\u0001\n\u0012\u0005false\u0018\u00e7\u0007\u00b2\u0001\u00b9\u0001\u0008\u00e8\u0007\u0010\u00e8\u0007\u001a\u00b0\u0001The legacy closed enum treatment in Java is deprecated and is scheduled to be removed in edition 2025.  Mark enum type on the enum definitions themselves rather than on fields.R\u0010legacyClosedEnum\u0012\u00af\u0002\n\u000futf8_validation\u0018\u0002 \u0001(\u000e2\u001f.pb.JavaFeatures.Utf8ValidationB\u00e4\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001\u00a2\u0001\u000c\u0012\u0007DEFAULT\u0018\u00e6\u0007\u00b2\u0001\u00c8\u0001\u0008\u00e8\u0007\u0010\u00e9\u0007\u001a\u00bf\u0001The Java-specific utf8 validation feature is deprecated and is scheduled to be removed in edition 2025.  Utf8 validation behavior should use the global cross-language utf8_validation feature.R\u000eutf8Validation\"F\n\u000eUtf8Validation\u0012\u001b\n\u0017UTF8_VALIDATION_UNKNOWN\u0010\u0000\u0012\u000b\n\u0007DEFAULT\u0010\u0001\u0012\n\n\u0006VERIFY\u0010\u0002:B\n\u0004java\u0012\u001b.google.protobuf.FeatureSet\u0018\u00e9\u0007 \u0001(\u000b2\u0010.pb.JavaFeaturesR\u0004javaB(\n\u0013com.google.protobufB\u0011JavaFeaturesProto"

    .line 739
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 766
    invoke-static {}, Ll/ۧۖۖ;->۬֫()Ll/ۚۖۖ;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ll/ۚۖۖ;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    .line 764
    invoke-static {v1, v3}, Ll/ۚۖۖ;->֫([Ljava/lang/String;[Ll/ۚۖۖ;)Ll/ۚۖۖ;

    move-result-object v1

    .line 769
    invoke-virtual {v1}, Ll/ۚۖۖ;->֨()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۖۖ;

    sput-object v2, Ll/᩻᩵ۖ;->֫:Ll/ᩳۖۖ;

    .line 770
    new-instance v3, Ll/ۢᩴۖ;

    const-string v5, "LegacyClosedEnum"

    const-string v6, "Utf8Validation"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v2, v5}, Ll/ۢᩴۖ;-><init>(Ll/ᩳۖۖ;[Ljava/lang/String;)V

    sput-object v3, Ll/᩻᩵ۖ;->ۧ:Ll/ۢᩴۖ;

    .line 774
    invoke-virtual {v1}, Ll/ۚۖۖ;->ۚ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۖۖ;

    invoke-virtual {v0, v2}, Ll/ܺᩴۖ;->֫(Ll/֡ۖۖ;)V

    .line 775
    invoke-virtual {v1}, Ll/ۚۖۖ;->᩸()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ֫()Ll/ᩳۖۖ;
    .locals 1

    .line 8
    sget-object v0, Ll/᩻᩵ۖ;->֫:Ll/ᩳۖۖ;

    return-object v0
.end method

.method public static synthetic ۧ()Ll/ۢᩴۖ;
    .locals 1

    .line 8
    sget-object v0, Ll/᩻᩵ۖ;->ۧ:Ll/ۢᩴۖ;

    return-object v0
.end method
