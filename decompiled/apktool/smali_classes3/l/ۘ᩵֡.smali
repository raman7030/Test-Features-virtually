.class public final Ll/ۘ᩵֡;
.super Ljava/lang/Object;
.source "O8YX"

# interfaces
.implements Ll/ᩴ֨֡;


# instance fields
.field public final ֫:Ll/ۖ֨֡;


# direct methods
.method public constructor <init>(Ll/ۖ֨֡;)V
    .locals 0

    .line 609
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 610
    iput-object p1, p0, Ll/ۘ᩵֡;->֫:Ll/ۖ֨֡;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۖ֨֡;
    .locals 1

    .line 615
    iget-object v0, p0, Ll/ۘ᩵֡;->֫:Ll/ۖ֨֡;

    return-object v0
.end method

.method public final ۧ()Ll/ᩳ֨֡;
    .locals 2

    .line 620
    iget-object v0, p0, Ll/ۘ᩵֡;->֫:Ll/ۖ֨֡;

    instance-of v1, v0, Ll/ܳ֡֡;

    if-eqz v1, :cond_0

    .line 621
    check-cast v0, Ll/ܳ֡֡;

    .line 622
    invoke-virtual {v0}, Ll/ܳ֡֡;->֫()Ll/ᩳ֨֡;

    move-result-object v0

    return-object v0

    .line 17
    :cond_0
    new-instance v0, Ll/ᩳ֨֡;

    invoke-direct {v0}, Ll/ᩳ֨֡;-><init>()V

    return-object v0
.end method
