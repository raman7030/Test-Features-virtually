.class public final Ll/ۖ᩶᩵;
.super Ll/ۡ᩶᩵;
.source "PAX3"


# instance fields
.field public final ᩶:Ll/ܺ᩶᩵;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ll/᩵᩶᩵;-><init>()V

    .line 52
    new-instance v0, Ll/ܺ᩶᩵;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Ll/ۖ᩶᩵;->᩶:Ll/ܺ᩶᩵;

    return-void
.end method


# virtual methods
.method public final ᩳ()Ljava/util/Random;
    .locals 2

    .line 57
    iget-object v0, p0, Ll/ۖ᩶᩵;->᩶:Ll/ܺ᩶᩵;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
