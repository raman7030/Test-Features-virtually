.class public final Ll/ܰۙܳ;
.super Ljava/lang/Object;
.source "1B34"

# interfaces
.implements Ll/᩺ܺܳ;


# instance fields
.field public final synthetic ᩶:Ljava/util/LinkedHashMap;

.field public final synthetic ᩸:Ll/ܿۗܳ;

.field public final synthetic ᩹:Ll/֫ۗܳ;


# direct methods
.method public constructor <init>(Ll/ܿۗܳ;Ljava/util/LinkedHashMap;Ll/֫ۗܳ;)V
    .locals 0

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۙܳ;->᩸:Ll/ܿۗܳ;

    iput-object p2, p0, Ll/ܰۙܳ;->᩶:Ljava/util/LinkedHashMap;

    iput-object p3, p0, Ll/ܰۙܳ;->᩹:Ll/֫ۗܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;Ljava/io/InputStream;)V
    .locals 3

    .line 169
    iget-object v0, p0, Ll/ܰۙܳ;->᩹:Ll/֫ۗܳ;

    :try_start_0
    iget-object v1, p0, Ll/ܰۙܳ;->᩶:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ۙܳ;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    invoke-virtual {p1}, Ll/۫ۙܳ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ll/֫ۗܳ;->֫(Ljava/lang/String;Z)V

    if-eqz p2, :cond_0

    .line 171
    iget-object v1, p0, Ll/ܰۙܳ;->᩸:Ll/ܿۗܳ;

    invoke-static {p2}, Ll/ܿۗܳ;->֫(Ljava/io/InputStream;)Ljava/io/BufferedInputStream;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܿۗܳ;->֫(Ll/ܿۗܳ;Ljava/io/BufferedInputStream;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 172
    invoke-virtual {v0, p1}, Ll/֫ۗܳ;->֫(Ll/۫ۙܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    :cond_0
    invoke-static {p2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 176
    throw p1
.end method

.method public final ֫(Ljava/io/IOException;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩻()Z
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ܰۙܳ;->᩸:Ll/ܿۗܳ;

    invoke-static {v0}, Ll/ܿۗܳ;->ۧ(Ll/ܿۗܳ;)Z

    move-result v0

    return v0
.end method
