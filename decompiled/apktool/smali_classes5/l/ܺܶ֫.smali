.class public final Ll/ܺܶ֫;
.super Ljava/lang/Object;
.source "Q74D"

# interfaces
.implements Ll/᩸۠֫;


# static fields
.field public static final ֫:Ll/ۡܶ֫;

.field public static final ۧ:Ll/ܺܶ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Ll/ܺܶ֫;

    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    sput-object v0, Ll/ܺܶ֫;->ۧ:Ll/ܺܶ֫;

    .line 30
    new-instance v0, Ll/ۡܶ֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۡܶ֫;-><init>(I)V

    sput-object v0, Ll/ܺܶ֫;->֫:Ll/ۡܶ֫;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final read([BII)I
    .locals 0

    .line 46
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 1

    .line 41
    new-instance p1, Ljava/io/IOException;

    const-string v0, "PlaceholderDataSource cannot be opened"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 99
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 0

    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
