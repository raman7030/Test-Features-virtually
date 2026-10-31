.class public final Ll/ܰۙ֫;
.super Ljava/lang/Object;
.source "H74H"

# interfaces
.implements Ll/᩸᩷ۧ;


# instance fields
.field public final synthetic ᩸:Ll/ᩳۗ֫;


# direct methods
.method public constructor <init>(Ll/ᩳۗ֫;)V
    .locals 0

    .line 955
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۙ֫;->᩸:Ll/ᩳۗ֫;

    return-void
.end method


# virtual methods
.method public final ֫(II)Ll/᩵ۢۧ;
    .locals 2

    .line 959
    iget-object p2, p0, Ll/ܰۙ֫;->᩸:Ll/ᩳۗ֫;

    invoke-static {p2}, Ll/ᩳۗ֫;->ܽ(Ll/ᩳۗ֫;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۙ֫;

    if-eqz v0, :cond_0

    return-object v0

    .line 965
    :cond_0
    invoke-static {p2}, Ll/ᩳۗ֫;->ᩳ(Ll/ᩳۗ֫;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 967
    new-instance p1, Ll/᩵᩷ۧ;

    invoke-direct {p1}, Ll/᩵᩷ۧ;-><init>()V

    return-object p1

    .line 970
    :cond_1
    new-instance v0, Ll/۟ۙ֫;

    invoke-static {p2}, Ll/ᩳۗ֫;->֫(Ll/ᩳۗ֫;)Ll/۫ܿۧ;

    move-result-object v1

    invoke-direct {v0, p2, v1, p1}, Ll/۟ۙ֫;-><init>(Ll/ᩳۗ֫;Ll/۫ܿۧ;I)V

    .line 971
    invoke-static {p2}, Ll/ᩳۗ֫;->ܽ(Ll/ᩳۗ֫;)Landroid/util/SparseArray;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v0
.end method

.method public final ֫(Ll/ۢۢۧ;)V
    .locals 1

    .line 982
    iget-object v0, p0, Ll/ܰۙ֫;->᩸:Ll/ᩳۗ֫;

    invoke-static {v0, p1}, Ll/ᩳۗ֫;->֫(Ll/ᩳۗ֫;Ll/ۢۢۧ;)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 977
    iget-object v0, p0, Ll/ܰۙ֫;->᩸:Ll/ᩳۗ֫;

    invoke-static {v0}, Ll/ᩳۗ֫;->ܿ(Ll/ᩳۗ֫;)V

    return-void
.end method
