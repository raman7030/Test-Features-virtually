.class public final Ll/᩸᩵ۧ;
.super Ljava/lang/Object;
.source "97TY"

# interfaces
.implements Ll/ۢᩴۧ;


# instance fields
.field public final ֫:Ll/ܶ᩵ۧ;

.field public final ۧ:Ll/ᩳ֨֫;

.field public ܽ:Ljava/util/zip/Inflater;

.field public final ᩳ:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/᩸᩵ۧ;->ᩳ:Ll/ᩳ֨֫;

    .line 63
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/᩸᩵ۧ;->ۧ:Ll/ᩳ֨֫;

    .line 64
    new-instance v0, Ll/ܶ᩵ۧ;

    invoke-direct {v0}, Ll/ܶ᩵ۧ;-><init>()V

    iput-object v0, p0, Ll/᩸᩵ۧ;->֫:Ll/ܶ᩵ۧ;

    .line 65
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v0, v1}, Ll/ܶ᩵ۧ;->֫(Ljava/lang/String;)V

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

    .line 80
    iget-object p4, p0, Ll/᩸᩵ۧ;->ᩳ:Ll/ᩳ֨֫;

    invoke-virtual {p4, p3, p1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 81
    invoke-virtual {p4, p2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 92
    iget-object p1, p0, Ll/᩸᩵ۧ;->ܽ:Ljava/util/zip/Inflater;

    if-nez p1, :cond_0

    .line 93
    new-instance p1, Ljava/util/zip/Inflater;

    invoke-direct {p1}, Ljava/util/zip/Inflater;-><init>()V

    iput-object p1, p0, Ll/᩸᩵ۧ;->ܽ:Ljava/util/zip/Inflater;

    .line 95
    :cond_0
    iget-object p1, p0, Ll/᩸᩵ۧ;->ܽ:Ljava/util/zip/Inflater;

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
    iget-object p2, p0, Ll/᩸᩵ۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-static {p4, p2, p1}, Ll/ۘ֨֫;->֫(Ll/ᩳ֨֫;Ll/ᩳ֨֫;Ljava/util/zip/Inflater;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 96
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p1

    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܿ()I

    move-result p2

    invoke-virtual {p4, p2, p1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 98
    :cond_1
    iget-object p1, p0, Ll/᩸᩵ۧ;->֫:Ll/ܶ᩵ۧ;

    invoke-virtual {p1}, Ll/ܶ᩵ۧ;->֫()V

    .line 99
    invoke-virtual {p4}, Ll/ᩳ֨֫;->֫()I

    move-result p2

    const/4 p3, 0x2

    if-lt p2, p3, :cond_3

    .line 100
    invoke-virtual {p4}, Ll/ᩳ֨֫;->ۗ()I

    move-result p3

    if-eq p3, p2, :cond_2

    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {p1, p4}, Ll/ܶ᩵ۧ;->ۧ(Ll/ᩳ֨֫;)V

    .line 104
    invoke-virtual {p1, p4}, Ll/ܶ᩵ۧ;->֫(Ll/ᩳ֨֫;)Ll/᩶֡֫;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 83
    :goto_1
    new-instance p2, Ll/۬ۘۧ;

    if-eqz p1, :cond_4

    .line 85
    invoke-static {p1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    :goto_2
    move-object v5, p1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/32 v3, 0x4c4b40

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    .line 83
    invoke-interface {p5, p2}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    return-void
.end method
