.class public final Ll/ܽ᩵ۧ;
.super Ljava/lang/Object;
.source "A8R4"

# interfaces
.implements Ll/ۢᩴۧ;


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public final ۧ:Ll/ۧ᩵ۧ;

.field public final ܽ:Ll/ᩳ֨֫;

.field public ᩳ:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ܽ᩵ۧ;->֫:Ll/ᩳ֨֫;

    .line 59
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ܽ᩵ۧ;->ܽ:Ll/ᩳ֨֫;

    .line 60
    new-instance v0, Ll/ۧ᩵ۧ;

    invoke-direct {v0}, Ll/ۧ᩵ۧ;-><init>()V

    iput-object v0, p0, Ll/ܽ᩵ۧ;->ۧ:Ll/ۧ᩵ۧ;

    return-void
.end method


# virtual methods
.method public final synthetic reset()V
    .locals 0

    return-void
.end method

.method public final synthetic ֫(II[B)Ll/ܰۘۧ;
    .locals 0

    .line 0
    invoke-static {p0, p3, p2}, Ll/ܳᩴۧ;->֫(Ll/ۢᩴۧ;[BI)Ll/ܰۘۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V
    .locals 6

    add-int/2addr p3, p2

    .line 75
    iget-object p4, p0, Ll/ܽ᩵ۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {p4, p3, p1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 76
    invoke-virtual {p4, p2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 77
    iget-object p1, p0, Ll/ܽ᩵ۧ;->ᩳ:Ljava/util/zip/Inflater;

    if-nez p1, :cond_0

    .line 78
    new-instance p1, Ljava/util/zip/Inflater;

    invoke-direct {p1}, Ljava/util/zip/Inflater;-><init>()V

    iput-object p1, p0, Ll/ܽ᩵ۧ;->ᩳ:Ljava/util/zip/Inflater;

    .line 80
    :cond_0
    iget-object p1, p0, Ll/ܽ᩵ۧ;->ᩳ:Ljava/util/zip/Inflater;

    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 3172
    invoke-virtual {p4}, Ll/ᩳ֨֫;->֫()I

    move-result p2

    if-lez p2, :cond_1

    .line 3173
    invoke-virtual {p4}, Ll/ᩳ֨֫;->ܳ()I

    move-result p2

    const/16 p3, 0x78

    if-ne p2, p3, :cond_1

    .line 3174
    iget-object p2, p0, Ll/ܽ᩵ۧ;->ܽ:Ll/ᩳ֨֫;

    invoke-static {p4, p2, p1}, Ll/ۘ֨֫;->֫(Ll/ᩳ֨֫;Ll/ᩳ֨֫;Ljava/util/zip/Inflater;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 81
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p1

    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܿ()I

    move-result p2

    invoke-virtual {p4, p2, p1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 83
    :cond_1
    iget-object p1, p0, Ll/ܽ᩵ۧ;->ۧ:Ll/ۧ᩵ۧ;

    invoke-virtual {p1}, Ll/ۧ᩵ۧ;->ۧ()V

    .line 84
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 85
    :cond_2
    :goto_0
    invoke-virtual {p4}, Ll/ᩳ֨֫;->֫()I

    move-result p2

    const/4 p3, 0x3

    if-lt p2, p3, :cond_5

    .line 97
    invoke-virtual {p4}, Ll/ᩳ֨֫;->ܿ()I

    move-result p2

    .line 98
    invoke-virtual {p4}, Ll/ᩳ֨֫;->֨()I

    move-result p3

    .line 99
    invoke-virtual {p4}, Ll/ᩳ֨֫;->ۗ()I

    move-result v0

    .line 101
    invoke-virtual {p4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    add-int/2addr v1, v0

    const/4 v2, 0x0

    if-le v1, p2, :cond_3

    .line 103
    invoke-virtual {p4, p2}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_2

    :cond_3
    const/16 p2, 0x80

    if-eq p3, p2, :cond_4

    packed-switch p3, :pswitch_data_0

    goto :goto_1

    .line 116
    :pswitch_0
    invoke-static {p1, p4, v0}, Ll/ۧ᩵ۧ;->ۧ(Ll/ۧ᩵ۧ;Ll/ᩳ֨֫;I)V

    goto :goto_1

    .line 113
    :pswitch_1
    invoke-static {p1, p4, v0}, Ll/ۧ᩵ۧ;->֫(Ll/ۧ᩵ۧ;Ll/ᩳ֨֫;I)V

    goto :goto_1

    .line 110
    :pswitch_2
    invoke-static {p1, p4, v0}, Ll/ۧ᩵ۧ;->ܽ(Ll/ۧ᩵ۧ;Ll/ᩳ֨֫;I)V

    goto :goto_1

    .line 119
    :cond_4
    invoke-virtual {p1}, Ll/ۧ᩵ۧ;->֫()Ll/᩶֡֫;

    move-result-object p2

    .line 120
    invoke-virtual {p1}, Ll/ۧ᩵ۧ;->ۧ()V

    move-object v2, p2

    .line 126
    :goto_1
    invoke-virtual {p4, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    :goto_2
    if-eqz v2, :cond_2

    .line 88
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 91
    :cond_5
    new-instance p1, Ll/۬ۘۧ;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    invoke-interface {p5, p1}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
