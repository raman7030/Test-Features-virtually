.class public final synthetic Ll/ᩴۧ᩻;
.super Ljava/lang/Object;
.source "22BV"

# interfaces
.implements Ljava/util/function/BooleanSupplier;


# instance fields
.field public final synthetic ᩸:Ll/۬۠ܿ;

.field public final synthetic ᩹:Ll/ܽۜܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۬۠ܿ;Ll/ܽۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۧ᩻;->᩸:Ll/۬۠ܿ;

    iput-object p2, p0, Ll/ᩴۧ᩻;->᩹:Ll/ܽۜܳ;

    return-void
.end method


# virtual methods
.method public final getAsBoolean()Z
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ᩴۧ᩻;->᩸:Ll/۬۠ܿ;

    .line 437
    iget-object v1, p0, Ll/ᩴۧ᩻;->᩹:Ll/ܽۜܳ;

    invoke-virtual {v1}, Ll/ܽۜܳ;->ᩳ()I

    move-result v2

    invoke-virtual {v1}, Ll/ܽۜܳ;->ۧ()I

    move-result v1

    const/16 v3, 0x2710

    const/4 v4, 0x0

    if-lt v1, v3, :cond_0

    and-int/lit8 v1, v2, 0x4

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    and-int/lit8 v1, v2, 0x24

    if-eqz v1, :cond_1

    goto :goto_0

    .line 156
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ll/۬۠ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v4, 0x1

    :goto_0
    xor-int/lit8 v0, v4, 0x1

    return v0
.end method
