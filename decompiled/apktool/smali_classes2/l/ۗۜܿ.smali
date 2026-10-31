.class public final synthetic Ll/ۗۜܿ;
.super Ljava/lang/Object;
.source "B4S2"

# interfaces
.implements Ll/֫᩷ܿ;


# instance fields
.field public final synthetic ֫:Landroid/content/res/AssetManager;

.field public final synthetic ۧ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۜܿ;->֫:Landroid/content/res/AssetManager;

    iput-object p2, p0, Ll/ۗۜܿ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getInputStream()Ljava/io/InputStream;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۗۜܿ;->֫:Landroid/content/res/AssetManager;

    .line 4
    iget-object v1, p0, Ll/ۗۜܿ;->ۧ:Ljava/lang/String;

    .line 494
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
