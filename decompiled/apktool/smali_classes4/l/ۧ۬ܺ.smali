.class public final Ll/ۧ۬ܺ;
.super Ll/֡᩶ܺ;
.source "Y4VB"


# instance fields
.field public final ᩶:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(ILl/ܳ۬ܺ;)V
    .locals 1

    .line 399
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p1}, Ll/֡᩶ܺ;-><init>(II)V

    .line 400
    iput-object p2, p0, Ll/ۧ۬ܺ;->᩶:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final ۧ(I)Ljava/lang/Object;
    .locals 1

    .line 405
    iget-object v0, p0, Ll/ۧ۬ܺ;->᩶:Ll/ܳ۬ܺ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
