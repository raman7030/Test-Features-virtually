.class public final Ll/۠ܶۖ;
.super Ll/᩻᩶ۚ;
.source "S50A"


# instance fields
.field public final synthetic ܽ:Ll/ܶܶۖ;

.field public final synthetic ܿ:Ll/ۨܶۖ;

.field public final synthetic ᩳ:Ll/ۜ᩶ۚ;


# direct methods
.method public constructor <init>(Ll/ܶܶۖ;Ll/ۨܶۖ;Ll/ۨܶۖ;Ll/ۜ᩶ۚ;)V
    .locals 0

    .line 94
    iput-object p1, p0, Ll/۠ܶۖ;->ܽ:Ll/ܶܶۖ;

    iput-object p3, p0, Ll/۠ܶۖ;->ܿ:Ll/ۨܶۖ;

    iput-object p4, p0, Ll/۠ܶۖ;->ᩳ:Ll/ۜ᩶ۚ;

    invoke-direct {p0, p2}, Ll/᩻᩶ۚ;-><init>(Ll/᩻᩶ۚ;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 97
    invoke-super {p0}, Ll/᩻᩶ۚ;->֫()V

    .line 98
    iget-object v0, p0, Ll/۠ܶۖ;->ܿ:Ll/ۨܶۖ;

    invoke-virtual {v0}, Ll/ۨܶۖ;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 100
    :try_start_0
    iget-object v1, p0, Ll/۠ܶۖ;->ܽ:Ll/ܶܶۖ;

    iget-object v1, v1, Ll/ܶܶۖ;->֫:[Ljava/lang/Object;

    iget-object v2, p0, Ll/۠ܶۖ;->ᩳ:Ll/ۜ᩶ۚ;

    invoke-virtual {v2}, Ll/ۜ᩶ۚ;->ۧ()[B

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    .line 102
    new-instance v2, Ll/ۛ۠ۖ;

    const-string v3, "ASM fail to generate .class file: "

    .line 0
    invoke-static {v3, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 55
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    throw v2
.end method
