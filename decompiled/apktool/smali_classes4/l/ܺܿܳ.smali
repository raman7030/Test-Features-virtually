.class public final synthetic Ll/ܺܿܳ;
.super Ljava/lang/Object;
.source "G72T"

# interfaces
.implements Ll/ۨᩳܳ;


# instance fields
.field public final synthetic ֫:Ll/ۖܿܳ;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:Ll/ᩳۜܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖܿܳ;ILl/ᩳۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺܿܳ;->֫:Ll/ۖܿܳ;

    iput p2, p0, Ll/ܺܿܳ;->ۧ:I

    iput-object p3, p0, Ll/ܺܿܳ;->ܽ:Ll/ᩳۜܳ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 3

    .line 0
    iget v0, p0, Ll/ܺܿܳ;->ۧ:I

    iget-object v1, p0, Ll/ܺܿܳ;->ܽ:Ll/ᩳۜܳ;

    iget-object v2, p0, Ll/ܺܿܳ;->֫:Ll/ۖܿܳ;

    invoke-static {v2, v0, v1}, Ll/ۖܿܳ;->֫(Ll/ۖܿܳ;ILl/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
