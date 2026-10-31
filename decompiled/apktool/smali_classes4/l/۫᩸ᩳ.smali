.class public final Ll/۫᩸ᩳ;
.super Ljava/lang/Object;
.source "CB2D"

# interfaces
.implements Ll/۟᩶ᩳ;


# instance fields
.field public final synthetic ֫:Ll/ۤ᩸ᩳ;


# direct methods
.method public constructor <init>(Ll/ۤ᩸ᩳ;)V
    .locals 0

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۗᩳ;)V
    .locals 6

    .line 170
    iget-object v0, p0, Ll/۫᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result v1

    if-ltz v1, :cond_0

    .line 183
    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v1

    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Ll/ۤ᩸ᩳ;->setSelection(II)V

    return-void

    .line 185
    :cond_0
    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v1

    const/16 v2, 0x22

    if-gez v1, :cond_1

    sget-object v1, Landroid/text/Selection;->SELECTION_START:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ll/ۤ᩸ᩳ;->removeSpan(Ljava/lang/Object;)V

    goto :goto_0

    .line 186
    :cond_1
    sget-object v1, Landroid/text/Selection;->SELECTION_START:Ljava/lang/Object;

    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v3

    invoke-virtual {v0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 187
    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v4

    invoke-virtual {v0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 186
    invoke-virtual {v0, v1, v3, v4, v2}, Ll/ۤ᩸ᩳ;->setSpan(Ljava/lang/Object;III)V

    .line 188
    :goto_0
    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result v1

    if-gez v1, :cond_2

    sget-object p1, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ll/ۤ᩸ᩳ;->removeSpan(Ljava/lang/Object;)V

    return-void

    .line 189
    :cond_2
    sget-object v1, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result v3

    invoke-virtual {v0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 190
    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result p1

    invoke-virtual {v0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v4

    invoke-static {p1, v4}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 189
    invoke-virtual {v0, v1, v3, p1, v2}, Ll/ۤ᩸ᩳ;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public final ֫(Ll/ۧۙᩳ;IILl/۬᩹ᩳ;)V
    .locals 6

    .line 173
    iget-object v0, p0, Ll/۫᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    invoke-virtual {p4}, Ll/۬᩹ᩳ;->length()I

    move-result v4

    move v1, p2

    move v2, p3

    move-object v3, p4

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ll/ۤ᩸ᩳ;->֫(Ll/ۤ᩸ᩳ;IILl/۬᩹ᩳ;ILl/ۧۙᩳ;)V

    return-void
.end method
