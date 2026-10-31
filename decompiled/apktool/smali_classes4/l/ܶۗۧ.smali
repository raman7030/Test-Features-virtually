.class public final Ll/ܶۗۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public final synthetic ֫:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;)V
    .locals 0

    .line 1073
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩶ۧ;)V
    .locals 4

    .line 1118
    iget v0, p1, Ll/ۚ᩶ۧ;->֫:I

    iget-object v1, p0, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/16 v3, 0x8

    if-eq v0, v3, :cond_0

    return-void

    .line 1130
    :cond_0
    iget-object v0, v1, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    iget v3, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    iget p1, p1, Ll/ۚ᩶ۧ;->ۧ:I

    invoke-virtual {v0, v1, v3, p1, v2}, Ll/ܿ۬ۧ;->onItemsMoved(Ll/۬۬ۧ;III)V

    return-void

    .line 1126
    :cond_1
    iget-object v0, v1, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    iget v2, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v3, p1, Ll/ۚ᩶ۧ;->ۧ:I

    iget-object p1, p1, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, p1}, Ll/ܿ۬ۧ;->onItemsUpdated(Ll/۬۬ۧ;IILjava/lang/Object;)V

    return-void

    .line 1123
    :cond_2
    iget-object v0, v1, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    iget v2, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    iget p1, p1, Ll/ۚ᩶ۧ;->ۧ:I

    invoke-virtual {v0, v1, v2, p1}, Ll/ܿ۬ۧ;->onItemsRemoved(Ll/۬۬ۧ;II)V

    return-void

    .line 1120
    :cond_3
    iget-object v0, v1, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    iget v2, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    iget p1, p1, Ll/ۚ᩶ۧ;->ۧ:I

    invoke-virtual {v0, v1, v2, p1}, Ll/ܿ۬ۧ;->onItemsAdded(Ll/۬۬ۧ;II)V

    return-void
.end method
