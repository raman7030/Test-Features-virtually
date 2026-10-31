.class public final synthetic Ll/۟ܶᩳ;
.super Ljava/lang/Object;
.source "NB3C"

# interfaces
.implements Ll/ᩳ᩸ᩳ;


# instance fields
.field public final synthetic ֫:Ll/ۗܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܶᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܶᩳ;->֫:Ll/ۗܶᩳ;

    return-void
.end method


# virtual methods
.method public final ۧ()Ljava/io/InputStream;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/۟ܶᩳ;->֫:Ll/ۗܶᩳ;

    .line 4
    check-cast v0, Ll/ۙܶᩳ;

    .line 88
    iget-object v0, v0, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v0

    return-object v0
.end method
