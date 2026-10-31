.class public abstract Ll/᩷᩵ܿ;
.super Ljava/lang/Object;
.source "N989"


# instance fields
.field public final ֫:Ll/ۜ᩵ܿ;

.field public final ۧ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ۜ᩵ܿ;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/᩷᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    .line 18
    iput-object p2, p0, Ll/᩷᩵ܿ;->֫:Ll/ۜ᩵ܿ;

    return-void
.end method


# virtual methods
.method public abstract ֫()J
.end method

.method public abstract ֫(I)V
.end method

.method public abstract ֫(J)V
.end method

.method public abstract ۧ()I
.end method

.method public final ܽ()V
    .locals 8

    .line 32
    iget-object v0, p0, Ll/᩷᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/᩷᩵ܿ;->֫:Ll/ۜ᩵ܿ;

    const/4 v2, 0x0

    :try_start_0
    invoke-interface {v1, v0, v2}, Ll/ۜ᩵ܿ;->֫(Ll/ܶ᩵ܿ;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    .line 36
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1, v2}, Ll/ۜ᩵ܿ;->֫(Ljava/io/IOException;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    .line 56
    :try_start_1
    invoke-virtual {p0}, Ll/᩷᩵ܿ;->ۧ()I

    move-result v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    or-int/lit16 v5, v4, 0x92

    if-eq v4, v5, :cond_0

    .line 61
    :try_start_2
    invoke-virtual {p0, v5}, Ll/᩷᩵ܿ;->֫(I)V

    const/4 v5, 0x1

    .line 63
    invoke-interface {v1, v0, v5}, Ll/ۜ᩵ܿ;->֫(Ll/ܶ᩵ܿ;I)V

    .line 66
    invoke-virtual {p0, v4}, Ll/᩷᩵ܿ;->֫(I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_1
    const/4 v4, -0x1

    .line 72
    :catch_2
    :cond_0
    :try_start_3
    invoke-virtual {p0}, Ll/᩷᩵ܿ;->֫()J

    move-result-wide v5

    .line 75
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    move-result v7

    if-eqz v7, :cond_3

    const/4 v7, 0x2

    .line 77
    invoke-interface {v1, v0, v7}, Ll/ۜ᩵ܿ;->֫(Ll/ܶ᩵ܿ;I)V

    if-eq v4, v3, :cond_1

    .line 81
    invoke-virtual {p0, v4}, Ll/᩷᩵ܿ;->֫(I)V

    :cond_1
    const-wide/16 v3, -0x1

    cmp-long v1, v5, v3

    if-eqz v1, :cond_2

    .line 86
    invoke-virtual {p0, v5, v6}, Ll/᩷᩵ܿ;->֫(J)V

    .line 89
    :cond_2
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :goto_0
    return-void

    .line 47
    :catch_3
    :cond_3
    throw v2

    .line 38
    :cond_4
    throw v2
.end method
