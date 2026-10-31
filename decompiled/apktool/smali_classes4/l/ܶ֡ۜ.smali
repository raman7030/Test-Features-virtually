.class public final synthetic Ll/ܶ֡ۜ;
.super Ljava/lang/Object;
.source "Q8FL"

# interfaces
.implements Ll/᩺᩻᩻;


# instance fields
.field public final synthetic ᩸:Ll/ۗۢ᩻;

.field public final synthetic ᩹:Ll/ᩳۜܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗۢ᩻;Ll/ᩳۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ֡ۜ;->᩸:Ll/ۗۢ᩻;

    iput-object p2, p0, Ll/ܶ֡ۜ;->᩹:Ll/ᩳۜܳ;

    return-void
.end method


# virtual methods
.method public final ֫(J)Ljava/io/InputStream;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܶ֡ۜ;->᩹:Ll/ᩳۜܳ;

    .line 852
    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܶ֡ۜ;->᩸:Ll/ۗۢ᩻;

    invoke-virtual {v1, p1, p2, v0}, Ll/ۗۢ᩻;->֫(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
