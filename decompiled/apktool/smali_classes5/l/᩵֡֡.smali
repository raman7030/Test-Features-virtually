.class public final Ll/᩵֡֡;
.super Ljava/lang/Object;
.source "07SP"

# interfaces
.implements Ll/ܿ֨֡;


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public ۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵֡֡;->֫:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Ll/᩵֡֡;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩺᩵֡;)Ll/ۙ֡֡;
    .locals 9

    .line 23
    invoke-virtual {p1}, Ll/᩺᩵֡;->֫()Ll/ۢ֨֡;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v0

    const/16 v1, 0x60

    .line 25
    invoke-virtual {p1, v1}, Ll/ۢ֨֡;->ۧ(C)I

    move-result v2

    .line 26
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v3

    .line 28
    iget-boolean v4, p0, Ll/᩵֡֡;->ۧ:Z

    iget-object v5, p0, Ll/᩵֡֡;->֫:Ljava/util/HashMap;

    if-eqz v4, :cond_1

    .line 29
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷֨֡;

    if-eqz v4, :cond_0

    .line 30
    invoke-virtual {v4, v0}, Ll/᩷֨֡;->֫(Ll/᩷֨֡;)I

    move-result v4

    if-gtz v4, :cond_1

    .line 33
    :cond_0
    new-instance v1, Ll/۬ۚ֡;

    invoke-virtual {p1, v0, v3}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳ֨֡;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/۬ۚ֡;-><init>(Ljava/lang/String;)V

    .line 21
    new-instance p1, Ll/ۙ֡֡;

    invoke-direct {p1, v1, v3}, Ll/ۙ֡֡;-><init>(Ll/֡ۚ֡;Ll/᩷֨֡;)V

    return-object p1

    .line 38
    :cond_1
    invoke-virtual {p1, v1}, Ll/ۢ֨֡;->֫(C)I

    move-result v4

    const/4 v6, 0x1

    if-lez v4, :cond_5

    .line 39
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object v4

    .line 40
    invoke-virtual {p1, v1}, Ll/ۢ֨֡;->ۧ(C)I

    move-result v7

    .line 42
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-ne v7, v2, :cond_1

    .line 44
    new-instance v0, Ll/۟֡֡;

    invoke-direct {v0}, Ll/۟֡֡;-><init>()V

    .line 46
    invoke-virtual {p1, v3, v4}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩳ֨֡;->֫()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    const/16 v3, 0x20

    .line 47
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x3

    if-lt v2, v4, :cond_4

    const/4 v2, 0x0

    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v3, :cond_4

    .line 0
    invoke-static {v6, v1}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v4

    if-ne v4, v3, :cond_4

    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    :goto_0
    if-ge v2, v4, :cond_3

    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    move v2, v4

    :goto_1
    if-eq v2, v4, :cond_4

    .line 0
    invoke-static {v6, v6, v1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 59
    :cond_4
    invoke-virtual {v0, v1}, Ll/۟֡֡;->֫(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object p1

    .line 21
    new-instance v1, Ll/ۙ֡֡;

    invoke-direct {v1, v0, p1}, Ll/ۙ֡֡;-><init>(Ll/֡ۚ֡;Ll/᩷֨֡;)V

    return-object v1

    .line 66
    :cond_5
    iput-boolean v6, p0, Ll/᩵֡֡;->ۧ:Z

    .line 69
    new-instance v1, Ll/۬ۚ֡;

    invoke-virtual {p1, v0, v3}, Ll/ۢ֨֡;->֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳ֨֡;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/۬ۚ֡;-><init>(Ljava/lang/String;)V

    .line 21
    new-instance p1, Ll/ۙ֡֡;

    invoke-direct {p1, v1, v3}, Ll/ۙ֡֡;-><init>(Ll/֡ۚ֡;Ll/᩷֨֡;)V

    return-object p1
.end method
