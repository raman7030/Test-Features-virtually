.class public final synthetic Ll/ܿۚ᩻;
.super Ljava/lang/Object;
.source "R9TK"

# interfaces
.implements Ll/᩻ۚ᩻;


# instance fields
.field public final synthetic ֫:Ll/ۜۚ᩻;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:J


# direct methods
.method public synthetic constructor <init>(Ll/ۜۚ᩻;Ljava/lang/String;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۚ᩻;->֫:Ll/ۜۚ᩻;

    iput-object p2, p0, Ll/ܿۚ᩻;->ۧ:Ljava/lang/String;

    iput-wide p3, p0, Ll/ܿۚ᩻;->ܽ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/OutputStream;)V
    .locals 4

    .line 149
    iget-object v0, p0, Ll/ܿۚ᩻;->֫:Ll/ۜۚ᩻;

    iget-object v0, v0, Ll/ۜۚ᩻;->᩸:Ll/۟֡᩻;

    iget-object v0, v0, Ll/۟֡᩻;->ۤ:Ll/ۗۢ᩻;

    iget-wide v1, p0, Ll/ܿۚ᩻;->ܽ:J

    iget-object v3, p0, Ll/ܿۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Ll/ۗۢ᩻;->֫(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    const/16 v1, 0x3000

    .line 150
    :try_start_0
    invoke-static {v0, p1, v1}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_0

    .line 149
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw p1
.end method
