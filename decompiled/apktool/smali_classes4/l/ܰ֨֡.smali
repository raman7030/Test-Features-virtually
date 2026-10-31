.class public final Ll/ܰ֨֡;
.super Ljava/lang/Object;
.source "07TI"

# interfaces
.implements Ll/۟֨֡;


# instance fields
.field public final ֫:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ll/᩺֨֡;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-static {p1}, Ll/᩺֨֡;->֫(Ll/᩺֨֡;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Ll/ܰ֨֡;->֫:Ljava/util/BitSet;

    return-void
.end method

.method public static ۧ()Ll/᩺֨֡;
    .locals 2

    .line 24
    new-instance v0, Ll/᩺֨֡;

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    invoke-direct {v0, v1}, Ll/᩺֨֡;-><init>(Ljava/util/BitSet;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Ll/᩺֨֡;
    .locals 2

    .line 20
    new-instance v0, Ll/᩺֨֡;

    iget-object v1, p0, Ll/ܰ֨֡;->֫:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/BitSet;

    invoke-direct {v0, v1}, Ll/᩺֨֡;-><init>(Ljava/util/BitSet;)V

    return-object v0
.end method

.method public final ֫(C)Z
    .locals 1

    .line 16
    iget-object v0, p0, Ll/ܰ֨֡;->֫:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method
