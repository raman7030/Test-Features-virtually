.class public final Ll/ۙᩳܿ;
.super Ll/ۧܿܿ;
.source "G7PV"


# static fields
.field public static final ᩻:Ll/᩶ᩳܿ;


# instance fields
.field public final ܳ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 130
    new-instance v0, Ll/᩶ᩳܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۙᩳܿ;->᩻:Ll/᩶ᩳܿ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, v0}, Ll/ۧܿܿ;-><init>(I)V

    .line 27
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۙᩳܿ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method private ֫(Ll/۟᩺ᩳ;)[I
    .locals 10

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 85
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v3

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v3

    const/4 v5, 0x1

    aput v3, v2, v5

    .line 86
    aget v6, v2, v4

    if-le v6, v3, :cond_0

    aput v3, v2, v4

    aput v6, v2, v5

    .line 92
    :cond_0
    iget-object v3, p0, Ll/ۙᩳܿ;->ܳ:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    invoke-static {v3}, Ll/֡ۧᩴ;->֫([C)Ll/ܶۧᩴ;

    move-result-object v3

    const/4 v6, 0x0

    .line 93
    :goto_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    .line 94
    invoke-interface {v3}, Ll/ܺۧᩴ;->֡ۧ()C

    move-result v7

    const/16 v8, 0x24

    if-ne v7, v8, :cond_6

    .line 95
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 96
    invoke-interface {v3}, Ll/ܺۧᩴ;->֡ۧ()C

    move-result v7

    if-eq v7, v8, :cond_5

    const/16 v8, 0x45

    if-eq v7, v8, :cond_3

    const/16 v8, 0x53

    if-eq v7, v8, :cond_2

    const/16 v8, 0x54

    if-eq v7, v8, :cond_1

    goto :goto_0

    .line 112
    :cond_1
    aget v7, v2, v4

    aget v8, v2, v5

    invoke-interface {p1, v7, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    new-array v6, v1, [I

    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    aput v7, v6, v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    aput v7, v6, v5

    goto :goto_0

    :cond_3
    if-eqz v6, :cond_4

    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    aput v7, v6, v5

    goto :goto_0

    :cond_4
    new-array v6, v1, [I

    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    aput v7, v6, v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    aput v7, v6, v5

    goto :goto_0

    .line 99
    :cond_5
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 119
    :cond_6
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 122
    :cond_7
    aget v1, v2, v4

    aget v3, v2, v5

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v3, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    if-eqz v6, :cond_8

    .line 124
    aget p1, v6, v4

    aget v0, v2, v4

    add-int/2addr p1, v0

    aput p1, v6, v4

    .line 125
    aget p1, v6, v5

    aget v0, v2, v4

    add-int/2addr p1, v0

    aput p1, v6, v5

    :cond_8
    return-object v6
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ۙᩳܿ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Landroid/view/View;Ll/֫ܿܿ;)V
    .locals 3

    .line 61
    invoke-interface {p2}, Ll/֫ܿܿ;->֫()Ll/۫ۨᩳ;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 65
    :cond_0
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/ۙᩳܿ;->֫(Ll/۟᩺ᩳ;)[I

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 67
    aget v1, p2, v0

    const/4 v2, 0x1

    aget p2, p2, v2

    invoke-virtual {p1, v1, p2}, Ll/۫ۨᩳ;->᩷(II)V

    .line 68
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ᩴܽ()V

    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result p2

    .line 71
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۬֫()I

    move-result v1

    if-eq p2, v1, :cond_2

    .line 73
    invoke-virtual {p1, v1}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 1330
    :cond_2
    :goto_0
    invoke-virtual {p1, v0}, Ll/۫ۨᩳ;->֫(Z)V

    return-void
.end method

.method public final ֫(Landroid/view/View;Ll/ۤۤᩳ;)V
    .locals 2

    .line 47
    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۙᩳܿ;->֫(Ll/۟᩺ᩳ;)[I

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 49
    aget v0, p1, v0

    const/4 v1, 0x1

    aget p1, p1, v1

    invoke-virtual {p2, v0, p1}, Ll/ۤۤᩳ;->᩷(II)V

    return-void

    .line 51
    :cond_0
    invoke-virtual {p2}, Ll/۫ۨᩳ;->۫֫()I

    move-result p1

    .line 52
    invoke-virtual {p2}, Ll/۫ۨᩳ;->۬֫()I

    move-result v0

    if-eq p1, v0, :cond_1

    .line 54
    invoke-virtual {p2, v0}, Ll/ۤۤᩳ;->ᩴ(I)V

    :cond_1
    return-void
.end method

.method public final ᩻()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
