.class public Ll/᩷ܶ᩵;
.super Ll/᩻ܶ᩵;
.source "NAXS"


# direct methods
.method public static final ֫(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ܺ᩹᩵;)V
    .locals 1

    const-string p5, "<this>"

    .line 5
    invoke-static {p0, p5}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3645
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 3647
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    const/4 v0, 0x1

    add-int/2addr p3, v0

    if-le p3, v0, :cond_0

    .line 3648
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_0
    if-eqz p6, :cond_1

    .line 92
    invoke-interface {p6, p5}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/CharSequence;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_1
    if-nez p5, :cond_2

    goto :goto_1

    .line 93
    :cond_2
    instance-of v0, p5, Ljava/lang/CharSequence;

    :goto_1
    if-eqz v0, :cond_3

    check-cast p5, Ljava/lang/CharSequence;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    .line 94
    :cond_3
    instance-of v0, p5, Ljava/lang/Character;

    if-eqz v0, :cond_4

    check-cast p5, Ljava/lang/Character;

    invoke-virtual {p5}, Ljava/lang/Character;->charValue()C

    move-result p5

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    goto :goto_0

    .line 95
    :cond_4
    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    .line 3654
    :cond_5
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method
