.class public final Ll/֡ۖ᩻;
.super Ll/ۚۖ᩻;
.source "H88G"


# static fields
.field public static final ֫:Ll/֡ۖ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 87
    new-instance v0, Ll/֡ۖ᩻;

    .line 89
    invoke-direct {v0}, Ll/ۚۖ᩻;-><init>()V

    .line 87
    sput-object v0, Ll/֡ۖ᩻;->֫:Ll/֡ۖ᩻;

    return-void
.end method

.method public static bridge synthetic ᩻()Ll/֡ۖ᩻;
    .locals 1

    .line 0
    sget-object v0, Ll/֡ۖ᩻;->֫:Ll/֡ۖ᩻;

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "Access Key"

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 124
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Secret Key"

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const v0, 0x7f12010b

    .line 104
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    const-string v0, "s3"

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
