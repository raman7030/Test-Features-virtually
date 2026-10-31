.class public final Ll/ۧ᩵֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public final ֫:Ll/ۗᩴ֫;

.field public final ۧ:Ll/ۛᩴ֫;

.field public final ܳ:Ll/᩺ᩴ֫;

.field public final ܽ:Ll/ۨᩴ֫;

.field public final ܿ:Ll/ܿ᩵֫;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2301
    new-instance v0, Ll/᩹ᩴ֫;

    invoke-direct {v0}, Ll/᩹ᩴ֫;-><init>()V

    invoke-virtual {v0}, Ll/᩹ᩴ֫;->֫()Ll/ۧ᩵֫;

    const/4 v0, 0x0

    .line 2391
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 2392
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x2

    .line 2393
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x3

    .line 2394
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x4

    .line 2395
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x5

    .line 2396
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۗᩴ֫;Ll/ۨᩴ֫;Ll/ۛᩴ֫;Ll/ܿ᩵֫;Ll/᩺ᩴ֫;)V
    .locals 0

    .line 2345
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2346
    iput-object p1, p0, Ll/ۧ᩵֫;->ᩳ:Ljava/lang/String;

    .line 2347
    iput-object p3, p0, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    .line 2349
    iput-object p4, p0, Ll/ۧ᩵֫;->ۧ:Ll/ۛᩴ֫;

    .line 2350
    iput-object p5, p0, Ll/ۧ᩵֫;->ܿ:Ll/ܿ᩵֫;

    .line 2351
    iput-object p2, p0, Ll/ۧ᩵֫;->֫:Ll/ۗᩴ֫;

    .line 2353
    iput-object p6, p0, Ll/ۧ᩵֫;->ܳ:Ll/᩺ᩴ֫;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 2366
    :cond_0
    instance-of v0, p1, Ll/ۧ᩵֫;

    if-nez v0, :cond_1

    goto :goto_1

    .line 2370
    :cond_1
    check-cast p1, Ll/ۧ᩵֫;

    .line 2372
    iget-object v0, p0, Ll/ۧ᩵֫;->ᩳ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۧ᩵֫;->ᩳ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۧ᩵֫;->֫:Ll/ۗᩴ֫;

    iget-object v1, p1, Ll/ۧ᩵֫;->֫:Ll/ۗᩴ֫;

    .line 2373
    invoke-virtual {v0, v1}, Ll/ۙᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    iget-object v1, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    .line 2374
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۧ᩵֫;->ۧ:Ll/ۛᩴ֫;

    iget-object v1, p1, Ll/ۧ᩵֫;->ۧ:Ll/ۛᩴ֫;

    .line 2375
    invoke-virtual {v0, v1}, Ll/ۛᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۧ᩵֫;->ܿ:Ll/ܿ᩵֫;

    iget-object v1, p1, Ll/ۧ᩵֫;->ܿ:Ll/ܿ᩵֫;

    .line 2376
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۧ᩵֫;->ܳ:Ll/᩺ᩴ֫;

    iget-object p1, p1, Ll/ۧ᩵֫;->ܳ:Ll/᩺ᩴ֫;

    .line 2377
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 2382
    iget-object v0, p0, Ll/ۧ᩵֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 2383
    iget-object v1, p0, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۨᩴ֫;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 2384
    iget-object v1, p0, Ll/ۧ᩵֫;->ۧ:Ll/ۛᩴ֫;

    invoke-virtual {v1}, Ll/ۛᩴ֫;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2385
    iget-object v0, p0, Ll/ۧ᩵֫;->֫:Ll/ۗᩴ֫;

    invoke-virtual {v0}, Ll/ۙᩴ֫;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 2386
    iget-object v1, p0, Ll/ۧ᩵֫;->ܿ:Ll/ܿ᩵֫;

    invoke-virtual {v1}, Ll/ܿ᩵֫;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2387
    iget-object v0, p0, Ll/ۧ᩵֫;->ܳ:Ll/᩺ᩴ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1
.end method

.method public final ֫()Ll/᩹ᩴ֫;
    .locals 1

    .line 2358
    new-instance v0, Ll/᩹ᩴ֫;

    invoke-direct {v0, p0}, Ll/᩹ᩴ֫;-><init>(Ll/ۧ᩵֫;)V

    return-object v0
.end method
