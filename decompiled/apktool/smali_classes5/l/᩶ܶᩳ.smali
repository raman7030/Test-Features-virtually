.class public Ll/᩶ܶᩳ;
.super Ll/ۚܺ֫;
.source "7B3O"


# instance fields
.field public ۗ:Z

.field public final ۙ:Ll/ۚۡ֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ll/ۚܺ֫;-><init>()V

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Ll/᩶ܶᩳ;->ۗ:Z

    .line 11
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/᩶ܶᩳ;->ۙ:Ll/ۚۡ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Throwable;)V
    .locals 1

    .line 18
    iget-object v0, p0, Ll/᩶ܶᩳ;->ۙ:Ll/ۚۡ֫;

    invoke-virtual {v0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V
    .locals 1

    .line 22
    iget-object v0, p0, Ll/᩶ܶᩳ;->ۙ:Ll/ۚۡ֫;

    invoke-virtual {v0, p1, p2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method
