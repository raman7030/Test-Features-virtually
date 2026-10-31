.class public final Ll/ۖۖ᩻;
.super Ll/ۚۖ᩻;
.source "H88G"


# static fields
.field public static final ֫:Ll/ۖۖ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 130
    new-instance v0, Ll/ۖۖ᩻;

    .line 132
    invoke-direct {v0}, Ll/ۚۖ᩻;-><init>()V

    .line 130
    sput-object v0, Ll/ۖۖ᩻;->֫:Ll/ۖۖ᩻;

    return-void
.end method

.method public static bridge synthetic ᩻()Ll/ۖۖ᩻;
    .locals 1

    .line 0
    sget-object v0, Ll/ۖۖ᩻;->֫:Ll/ۖۖ᩻;

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "Access Key Id"

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 167
    new-instance v0, Ll/ܽۖ᩻;

    invoke-direct {v0, p1, p2}, Ll/ܽۖ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܽۖ᩻;->֫()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Access Key Secret"

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const v0, 0x7f12003a

    .line 147
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    const-string v0, "oss"

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
