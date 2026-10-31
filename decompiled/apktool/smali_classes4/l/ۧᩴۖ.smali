.class public Ll/ۧᩴۖ;
.super Ljava/lang/Object;
.source "X93U"

# interfaces
.implements Ll/ۛۘۖ;


# instance fields
.field public final ֫:Ll/֫ᩴۖ;

.field public final ۧ:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 2579
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2580
    new-instance v0, Ll/֫ᩴۖ;

    invoke-direct {v0, p1, p2, p3}, Ll/֫ᩴۖ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 2582
    invoke-static {v0}, Ll/֫ᩴۖ;->֫(Ll/֫ᩴۖ;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Ll/ۧᩴۖ;->ۧ:Ljava/lang/Class;

    .line 2583
    iput-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    return-void
.end method


# virtual methods
.method public ֫(ILl/ۘᩴۖ;)Ljava/lang/Object;
    .locals 1

    .line 2619
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1, p2}, Ll/֫ᩴۖ;->֫(ILl/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 1

    .line 2592
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1}, Ll/֫ᩴۖ;->֫(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫()Ll/ܳ֡ۖ;
    .locals 2

    .line 2664
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "newBuilderForField() called on a non-Message type."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ֫(Ll/᩶ۘۖ;I)Ll/ܳ֡ۖ;
    .locals 0

    .line 2675
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "getRepeatedFieldBuilder() called on a non-Message type."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩶ۘۖ;)V
    .locals 1

    .line 2659
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1}, Ll/֫ᩴۖ;->֫(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public ֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V
    .locals 1

    .line 2629
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1, p2, p3}, Ll/֫ᩴۖ;->֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 1

    .line 2611
    invoke-virtual {p0, p1}, Ll/ۧᩴۖ;->֫(Ll/᩶ۘۖ;)V

    .line 2612
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 2613
    invoke-virtual {p0, p1, v0}, Ll/ۧᩴۖ;->ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;
    .locals 1

    .line 2597
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1}, Ll/֫ᩴۖ;->ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ll/᩶ۘۖ;I)Ljava/lang/Object;
    .locals 1

    .line 2624
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1, p2}, Ll/֫ᩴۖ;->֫(Ll/᩶ۘۖ;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 1

    .line 2634
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1, p2}, Ll/֫ᩴۖ;->֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/ۘᩴۖ;)Z
    .locals 1

    .line 2639
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "hasField() called on a repeated field."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 0

    .line 2602
    invoke-virtual {p0, p1}, Ll/ۧᩴۖ;->֫(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/᩶ۘۖ;)Z
    .locals 1

    .line 2644
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "hasField() called on a repeated field."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ(Ll/᩶ۘۖ;)I
    .locals 1

    .line 2654
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1}, Ll/֫ᩴۖ;->ܽ(Ll/᩶ۘۖ;)I

    move-result p1

    return p1
.end method

.method public final ᩳ(Ll/ۘᩴۖ;)I
    .locals 1

    .line 2649
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1}, Ll/֫ᩴۖ;->ۧ(Ll/ۘᩴۖ;)I

    move-result p1

    return p1
.end method

.method public final ᩳ(Ll/᩶ۘۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 2670
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getFieldBuilder() called on a non-Message type."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
