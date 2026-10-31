.class public final Ll/֫ۛ᩷;
.super Ljava/lang/Object;
.source "31K1"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ܳۛ᩷;

.field public ܽ:Ljava/util/LinkedList;

.field public final synthetic ᩳ:Ll/ܿۛ᩷;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ܿۛ᩷;Ljava/util/LinkedList;Ll/ܳۛ᩷;Z)V
    .locals 0

    .line 1944
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۛ᩷;->ᩳ:Ll/ܿۛ᩷;

    .line 1945
    iput-object p2, p0, Ll/֫ۛ᩷;->ܽ:Ljava/util/LinkedList;

    .line 1946
    iput-object p3, p0, Ll/֫ۛ᩷;->ۧ:Ll/ܳۛ᩷;

    .line 1947
    iput-boolean p4, p0, Ll/֫ۛ᩷;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 1975
    iget-object v0, p0, Ll/֫ۛ᩷;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1976
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۛ᩷;

    invoke-virtual {v0}, Ll/֫ۛ᩷;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 1951
    iget-boolean v0, p0, Ll/֫ۛ᩷;->֫:Z

    iget-object v1, p0, Ll/֫ۛ᩷;->ᩳ:Ll/ܿۛ᩷;

    iget-object v2, p0, Ll/֫ۛ᩷;->ۧ:Ll/ܳۛ᩷;

    if-nez v0, :cond_1

    invoke-virtual {v2}, Ll/ܳۛ᩷;->ۖ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1955
    :cond_0
    invoke-virtual {v1}, Ll/ܿۛ᩷;->ܰ()V

    .line 1956
    invoke-static {v1, v2}, Ll/ܿۛ᩷;->ᩳ(Ll/ܿۛ᩷;Ll/ܳۛ᩷;)V

    .line 1957
    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 1958
    invoke-virtual {v2}, Ll/ܳۛ᩷;->ܺ()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x19

    invoke-static {v2, v1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    const v1, 0x7f1208cd

    .line 1959
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/᩺ۤ᩷;

    invoke-direct {v1, p0}, Ll/᩺ۤ᩷;-><init>(Ll/֫ۛ᩷;)V

    const v2, 0x7f1208c4

    .line 1960
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ܰۤ᩷;

    invoke-direct {v1, p0}, Ll/ܰۤ᩷;-><init>(Ll/֫ۛ᩷;)V

    const v2, 0x7f1202c2

    .line 1965
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    const/4 v2, 0x0

    .line 1969
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1970
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 1952
    :cond_1
    :goto_0
    invoke-virtual {v2, v1}, Ll/ܳۛ᩷;->֫(Ll/ܿۛ᩷;)V

    .line 1953
    invoke-virtual {p0}, Ll/֫ۛ᩷;->֫()V

    return-void
.end method
