.class public final Ll/֨۟ۜ;
.super Ljava/lang/Object;
.source "178J"

# interfaces
.implements Ll/᩸᩷ۧ;


# instance fields
.field public final ᩶:Landroid/net/Uri;

.field public final ᩸:Ll/᩸᩷ۧ;

.field public final ᩹:Ll/֫۟ۜ;


# direct methods
.method public constructor <init>(Ll/᩸᩷ۧ;Ll/֫۟ۜ;Landroid/net/Uri;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Ll/֨۟ۜ;->᩸:Ll/᩸᩷ۧ;

    .line 137
    iput-object p2, p0, Ll/֨۟ۜ;->᩹:Ll/֫۟ۜ;

    .line 138
    iput-object p3, p0, Ll/֨۟ۜ;->᩶:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final ֫(II)Ll/᩵ۢۧ;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/֨۟ۜ;->᩸:Ll/᩸᩷ۧ;

    invoke-interface {v0, p1, p2}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۢۢۧ;)V
    .locals 4

    .line 153
    instance-of v0, p1, Ll/᩷ۢۧ;

    iget-object v1, p0, Ll/֨۟ۜ;->᩸:Ll/᩸᩷ۧ;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/֨۟ۜ;->᩶:Landroid/net/Uri;

    if-nez v0, :cond_0

    goto :goto_5

    :cond_0
    const/4 v2, 0x0

    .line 163
    :try_start_0
    iget-object v3, p0, Ll/֨۟ۜ;->᩹:Ll/֫۟ۜ;

    check-cast v3, Ll/ܽۚۜ;

    invoke-virtual {v3, v0}, Ll/ܽۚۜ;->֫(Landroid/net/Uri;)Ll/۟ܰۜ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_1

    goto :goto_0

    .line 164
    :cond_1
    :try_start_1
    sget v3, Ll/֡۟ۜ;->֫:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    :try_start_2
    new-instance v3, Ll/ۢ۟ۜ;

    invoke-direct {v3, v0}, Ll/ۢ۟ۜ;-><init>(Ll/۟ܰۜ;)V

    invoke-static {v3}, Ll/ۢ۟ۜ;->֫(Ll/ۢ۟ۜ;)Ll/᩷᩷ۧ;

    move-result-object v3
    :try_end_2
    .catch Ll/᩵۟ۜ; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/ArithmeticException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    :goto_0
    move-object v3, v2

    :goto_1
    if-eqz v0, :cond_2

    .line 165
    :try_start_3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :cond_2
    move-object v2, v3

    goto :goto_3

    :catchall_0
    move-exception v3

    .line 163
    :try_start_4
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    nop

    :goto_3
    if-nez v2, :cond_3

    goto :goto_4

    :cond_3
    move-object p1, v2

    .line 158
    :goto_4
    invoke-interface {v1, p1}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    return-void

    .line 154
    :cond_4
    :goto_5
    invoke-interface {v1, p1}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 148
    iget-object v0, p0, Ll/֨۟ۜ;->᩸:Ll/᩸᩷ۧ;

    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    return-void
.end method
