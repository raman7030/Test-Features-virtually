.class public final Ll/֫֫᩻;
.super Ljava/lang/Object;
.source "CAJV"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public ۙ:I

.field public final ᩶:I

.field public ᩸:Z

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-boolean p1, p0, Ll/֫֫᩻;->᩹:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x13

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    .line 25
    :goto_0
    iput p1, p0, Ll/֫֫᩻;->᩶:I

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 45
    iget-boolean v0, p0, Ll/֫֫᩻;->᩸:Z

    iget v1, p0, Ll/֫֫᩻;->᩶:I

    if-eqz v0, :cond_a

    .line 46
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget v2, p0, Ll/֫֫᩻;->ۙ:I

    add-int/lit8 v2, v2, 0x2

    if-lt v0, v2, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-le v0, v1, :cond_3

    .line 47
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0x30

    if-lt v0, v2, :cond_2

    const/16 v3, 0x39

    if-le v0, v3, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    add-int/lit8 v4, v0, 0x1

    add-int/lit8 v0, v0, 0x2

    invoke-interface {p1, v4, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 53
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget v4, p0, Ll/֫֫᩻;->ۙ:I

    add-int/lit8 v5, v4, 0x2

    if-lt v0, v5, :cond_a

    add-int/lit8 v4, v4, 0x1

    .line 54
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-lt v0, v2, :cond_1

    if-le v0, v3, :cond_a

    .line 56
    :cond_1
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    add-int/lit8 v0, v0, 0x2

    invoke-static {p1, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    add-int/lit8 v2, v0, 0x1

    invoke-interface {p1, v0, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 50
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    goto :goto_1

    .line 60
    :cond_3
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_5

    :cond_4
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    const/4 v2, 0x6

    if-ne v0, v2, :cond_6

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x7

    if-ne v0, v2, :cond_6

    :cond_5
    const/16 v0, 0x2d

    .line 61
    invoke-interface {p1, v0}, Landroid/text/Editable;->append(C)Landroid/text/Editable;

    goto :goto_1

    .line 62
    :cond_6
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    const/16 v2, 0x9

    if-ne v0, v2, :cond_7

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v2, 0xa

    if-ne v0, v2, :cond_7

    const/16 v0, 0x20

    .line 63
    invoke-interface {p1, v0}, Landroid/text/Editable;->append(C)Landroid/text/Editable;

    goto :goto_1

    .line 64
    :cond_7
    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    const/16 v2, 0xc

    if-ne v0, v2, :cond_8

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v2, 0xd

    if-eq v0, v2, :cond_9

    :cond_8
    iget-boolean v0, p0, Ll/֫֫᩻;->᩹:Z

    if-eqz v0, :cond_a

    iget v0, p0, Ll/֫֫᩻;->ۙ:I

    const/16 v2, 0xf

    if-ne v0, v2, :cond_a

    .line 65
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v2, 0x10

    if-ne v0, v2, :cond_a

    :cond_9
    const/16 v0, 0x3a

    .line 66
    invoke-interface {p1, v0}, Landroid/text/Editable;->append(C)Landroid/text/Editable;

    .line 69
    :cond_a
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-le v0, v1, :cond_b

    .line 70
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p1, v1, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    :cond_b
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    if-nez p3, :cond_0

    const/4 p1, 0x1

    if-ne p4, p1, :cond_0

    .line 36
    iput-boolean p1, p0, Ll/֫֫᩻;->᩸:Z

    .line 37
    iput p2, p0, Ll/֫֫᩻;->ۙ:I

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 39
    iput-boolean p1, p0, Ll/֫֫᩻;->᩸:Z

    return-void
.end method
