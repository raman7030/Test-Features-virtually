.class public final synthetic Ll/ܿۨ֡;
.super Ljava/lang/Object;
.source "36B9"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ۙ:Ljava/util/BitSet;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩷ۨ֡;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩷ۨ֡;IILjava/util/BitSet;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۨ֡;->᩸:Ll/᩷ۨ֡;

    iput p2, p0, Ll/ܿۨ֡;->᩹:I

    iput p3, p0, Ll/ܿۨ֡;->᩶:I

    iput-object p4, p0, Ll/ܿۨ֡;->ۙ:Ljava/util/BitSet;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 8

    .line 161
    new-instance v7, Ll/ܳۨ֡;

    iget-object v1, p0, Ll/ܿۨ֡;->᩸:Ll/᩷ۨ֡;

    iget-object v2, v1, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    iget v6, p0, Ll/ܿۨ֡;->᩹:I

    iget v4, p0, Ll/ܿۨ֡;->᩶:I

    iget-object v5, p0, Ll/ܿۨ֡;->ۙ:Ljava/util/BitSet;

    move-object v0, v7

    move v3, v6

    invoke-direct/range {v0 .. v6}, Ll/ܳۨ֡;-><init>(Ll/᩷ۨ֡;Ll/۬ۛ֡;IILjava/util/BitSet;I)V

    return-object v7
.end method
