.class public final Ll/۫ۜܽ;
.super Ljava/lang/Object;
.source "M5I6"

# interfaces
.implements Ll/֫᩷ܽ;


# instance fields
.field public final synthetic ᩸:Ll/ۤۜܽ;


# direct methods
.method public constructor <init>(Ll/ۤۜܽ;)V
    .locals 0

    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۜܽ;->᩸:Ll/ۤۜܽ;

    return-void
.end method


# virtual methods
.method public final writeByte(I)V
    .locals 4

    .line 231
    iget-object v0, p0, Ll/۫ۜܽ;->᩸:Ll/ۤۜܽ;

    invoke-static {v0}, Ll/ۤۜܽ;->֫(Ll/ۤۜܽ;)[B

    move-result-object v1

    invoke-static {v0}, Ll/ۤۜܽ;->ۧ(Ll/ۤۜܽ;)I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-static {v0, v3}, Ll/ۤۜܽ;->֫(Ll/ۤۜܽ;I)V

    int-to-byte p1, p1

    aput-byte p1, v1, v2

    return-void
.end method
