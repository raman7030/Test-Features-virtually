.class public final Ll/ܿۧۧ;
.super Ll/ܰ֫ۧ;
.source "68QN"


# static fields
.field public static final ܿ:Ljava/lang/Object;


# instance fields
.field public final ܽ:Ljava/lang/Object;

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 260
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ۙ᩵֫;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 296
    invoke-direct {p0, p1}, Ll/ܰ֫ۧ;-><init>(Ll/ۙ᩵֫;)V

    .line 297
    iput-object p2, p0, Ll/ܿۧۧ;->ᩳ:Ljava/lang/Object;

    .line 298
    iput-object p3, p0, Ll/ܿۧۧ;->ܽ:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿۧۧ;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۧۧ;->ܽ:Ljava/lang/Object;

    return-object p0
.end method

.method public static ֫(Ll/ۙ᩵֫;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܿۧۧ;
    .locals 1

    .line 289
    new-instance v0, Ll/ܿۧۧ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܿۧۧ;-><init>(Ll/ۙ᩵֫;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ֫(Ll/ۧ᩵֫;)Ll/ܿۧۧ;
    .locals 3

    .line 271
    new-instance v0, Ll/ܿۧۧ;

    new-instance v1, Ll/ܳۧۧ;

    invoke-direct {v1, p0}, Ll/ܳۧۧ;-><init>(Ll/ۧ᩵֫;)V

    sget-object p0, Ll/᩶᩵֫;->ۚ:Ljava/lang/Object;

    sget-object v2, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    invoke-direct {v0, v1, p0, v2}, Ll/ܿۧۧ;-><init>(Ll/ۙ᩵֫;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 1

    .line 331
    sget-object v0, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܿۧۧ;->ܽ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 330
    :cond_0
    iget-object v0, p0, Ll/ܰ֫ۧ;->ۧ:Ll/ۙ᩵֫;

    invoke-virtual {v0, p1}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 1

    .line 338
    iget-object v0, p0, Ll/ܰ֫ۧ;->ۧ:Ll/ۙ᩵֫;

    invoke-virtual {v0, p1}, Ll/ۙ᩵֫;->֫(I)Ljava/lang/Object;

    move-result-object p1

    .line 339
    iget-object v0, p0, Ll/ܿۧۧ;->ܽ:Ljava/lang/Object;

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/ۙ᩵֫;)Ll/ܿۧۧ;
    .locals 3

    .line 307
    new-instance v0, Ll/ܿۧۧ;

    iget-object v1, p0, Ll/ܿۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v2, p0, Ll/ܿۧۧ;->ܽ:Ljava/lang/Object;

    invoke-direct {v0, p1, v1, v2}, Ll/ܿۧۧ;-><init>(Ll/ۙ᩵֫;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;
    .locals 1

    .line 312
    iget-object v0, p0, Ll/ܰ֫ۧ;->ۧ:Ll/ۙ᩵֫;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    .line 313
    iget-object p1, p2, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    iget-object p3, p0, Ll/ܿۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-static {p1, p3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 314
    sget-object p1, Ll/᩶᩵֫;->ۚ:Ljava/lang/Object;

    iput-object p1, p2, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final ֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;
    .locals 1

    .line 321
    iget-object v0, p0, Ll/ܰ֫ۧ;->ۧ:Ll/ۙ᩵֫;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    .line 322
    iget-object p1, p2, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    iget-object v0, p0, Ll/ܿۧۧ;->ܽ:Ljava/lang/Object;

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    .line 323
    sget-object p1, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    iput-object p1, p2, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method
