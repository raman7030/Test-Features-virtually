.class public final Ll/᩷᩺᩷;
.super Ljava/lang/Object;
.source "P1EM"

# interfaces
.implements Ll/᩶ۛ᩷;


# instance fields
.field public final synthetic ֫:Ll/᩵ۨ᩷;

.field public final synthetic ۜ:Z

.field public final synthetic ۡ:I

.field public final synthetic ۢ:I

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܳ:Ljava/lang/String;

.field public final synthetic ܽ:Z

.field public final synthetic ܿ:Z

.field public final synthetic ᩳ:Ljava/util/Set;

.field public final synthetic ᩷:Z

.field public final synthetic ᩻:Ll/ۡ᩺᩷;


# direct methods
.method public constructor <init>(ILjava/lang/String;ZZLl/ۡ᩺᩷;IZLl/᩵ۨ᩷;Ljava/lang/String;ZLjava/util/Set;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/᩷᩺᩷;->ۢ:I

    iput-object p2, p0, Ll/᩷᩺᩷;->ۧ:Ljava/lang/String;

    iput-boolean p3, p0, Ll/᩷᩺᩷;->ۜ:Z

    iput-boolean p4, p0, Ll/᩷᩺᩷;->ܿ:Z

    iput-object p5, p0, Ll/᩷᩺᩷;->᩻:Ll/ۡ᩺᩷;

    iput p6, p0, Ll/᩷᩺᩷;->ۡ:I

    iput-boolean p7, p0, Ll/᩷᩺᩷;->ܽ:Z

    iput-object p8, p0, Ll/᩷᩺᩷;->֫:Ll/᩵ۨ᩷;

    iput-object p9, p0, Ll/᩷᩺᩷;->ܳ:Ljava/lang/String;

    iput-boolean p10, p0, Ll/᩷᩺᩷;->᩷:Z

    iput-object p11, p0, Ll/᩷᩺᩷;->ᩳ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/ArrayList;)Ll/֨ۛ᩷;
    .locals 3

    .line 193
    new-instance v0, Ll/֨ۛ᩷;

    iget-object v1, p0, Ll/᩷᩺᩷;->ܳ:Ljava/lang/String;

    iget-object v2, p0, Ll/᩷᩺᩷;->ۧ:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Ll/֨ۛ᩷;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public final ֫()Ll/۠ۛ᩷;
    .locals 7

    .line 50
    iget-boolean v0, p0, Ll/᩷᩺᩷;->ܿ:Z

    iget-boolean v1, p0, Ll/᩷᩺᩷;->ۜ:Z

    iget-object v2, p0, Ll/᩷᩺᩷;->ۧ:Ljava/lang/String;

    iget v3, p0, Ll/᩷᩺᩷;->ۢ:I

    if-eqz v3, :cond_4

    const/4 v4, 0x1

    iget v5, p0, Ll/᩷᩺᩷;->ۡ:I

    iget-object v6, p0, Ll/᩷᩺᩷;->᩻:Ll/ۡ᩺᩷;

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v0, 0x3

    if-eq v3, v0, :cond_1

    const/4 v0, 0x4

    if-eq v3, v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 160
    :cond_0
    new-instance v0, Ll/ۜ᩺᩷;

    invoke-direct {v0, v6, v5}, Ll/ۜ᩺᩷;-><init>(Ll/ۡ᩺᩷;I)V

    return-object v0

    .line 141
    :cond_1
    new-instance v0, Ll/᩻᩺᩷;

    invoke-direct {v0, v6, v5}, Ll/᩻᩺᩷;-><init>(Ll/ۡ᩺᩷;I)V

    return-object v0

    .line 97
    :cond_2
    invoke-static {v2, v1, v0}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;ZZ)Ll/ܶۛ᩷;

    move-result-object v0

    .line 98
    new-instance v1, Ll/ܳ᩺᩷;

    iget-boolean v2, p0, Ll/᩷᩺᩷;->ܽ:Z

    invoke-direct {v1, v6, v0, v2}, Ll/ܳ᩺᩷;-><init>(Ll/ۡ᩺᩷;Ll/ܶۛ᩷;Z)V

    return-object v1

    .line 78
    :cond_3
    new-instance v0, Ll/ܿ᩺᩷;

    invoke-direct {v0, v6, v5}, Ll/ܿ᩺᩷;-><init>(Ll/ۡ᩺᩷;I)V

    return-object v0

    .line 52
    :cond_4
    invoke-static {v2, v1, v0}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;ZZ)Ll/ܶۛ᩷;

    move-result-object v0

    .line 53
    new-instance v1, Ll/ۘ᩹ܽ;

    const/16 v2, 0x9

    invoke-direct {v1, v2, v0}, Ll/ۘ᩹ܽ;-><init>(ILjava/lang/Object;)V

    return-object v1
.end method

.method public final ֫(Ljava/util/concurrent/ConcurrentLinkedQueue;)V
    .locals 4

    .line 188
    iget-boolean v0, p0, Ll/᩷᩺᩷;->᩷:Z

    iget-object v1, p0, Ll/᩷᩺᩷;->ᩳ:Ljava/util/Set;

    iget-object v2, p0, Ll/᩷᩺᩷;->֫:Ll/᩵ۨ᩷;

    iget-object v3, p0, Ll/᩷᩺᩷;->ܳ:Ljava/lang/String;

    invoke-virtual {v2, p1, v3, v0, v1}, Ll/᩵ۨ᩷;->֫(Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/String;ZLjava/util/Set;)V

    return-void
.end method
