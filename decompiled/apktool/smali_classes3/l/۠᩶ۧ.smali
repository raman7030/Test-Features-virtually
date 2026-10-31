.class public final Ll/۠᩶ۧ;
.super Ljava/lang/Object;
.source "V4XO"


# instance fields
.field public final ֫:Ll/᩶ۗۧ;


# direct methods
.method public constructor <init>(Ll/᩶ۗۧ;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/۠᩶ۧ;->֫:Ll/᩶ۗۧ;

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 2

    const/4 v0, 0x0

    .line 63
    iget-object v1, p0, Ll/۠᩶ۧ;->֫:Ll/᩶ۗۧ;

    invoke-virtual {v1, p1, p2, v0}, Ll/᩶ۗۧ;->notifyItemRangeChanged(IILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(II)V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/۠᩶ۧ;->֫:Ll/᩶ۗۧ;

    invoke-virtual {v0, p1, p2}, Ll/᩶ۗۧ;->notifyItemRangeInserted(II)V

    return-void
.end method

.method public final ܽ(II)V
    .locals 1

    .line 56
    iget-object v0, p0, Ll/۠᩶ۧ;->֫:Ll/᩶ۗۧ;

    invoke-virtual {v0, p1, p2}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    return-void
.end method

.method public final ᩳ(II)V
    .locals 1

    .line 50
    iget-object v0, p0, Ll/۠᩶ۧ;->֫:Ll/᩶ۗۧ;

    invoke-virtual {v0, p1, p2}, Ll/᩶ۗۧ;->notifyItemRangeRemoved(II)V

    return-void
.end method
