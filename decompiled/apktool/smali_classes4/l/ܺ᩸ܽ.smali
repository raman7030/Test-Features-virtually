.class public final synthetic Ll/ܺ᩸ܽ;
.super Ljava/lang/Object;
.source "G1PO"

# interfaces
.implements Ll/ܰ᩸ܽ;


# instance fields
.field public final synthetic ֫:Ll/ᩴ᩸ܽ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/io/BufferedOutputStream;

.field public final synthetic ᩳ:Ll/ۨۖܽ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴ᩸ܽ;Ljava/lang/String;Ljava/io/BufferedOutputStream;Ll/ۨۖܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩸ܽ;->֫:Ll/ᩴ᩸ܽ;

    iput-object p2, p0, Ll/ܺ᩸ܽ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ܺ᩸ܽ;->ܽ:Ljava/io/BufferedOutputStream;

    iput-object p4, p0, Ll/ܺ᩸ܽ;->ᩳ:Ll/ۨۖܽ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Ll/ܺ᩸ܽ;->ܽ:Ljava/io/BufferedOutputStream;

    iget-object v1, p0, Ll/ܺ᩸ܽ;->ᩳ:Ll/ۨۖܽ;

    iget-object v2, p0, Ll/ܺ᩸ܽ;->֫:Ll/ᩴ᩸ܽ;

    iget-object v3, p0, Ll/ܺ᩸ܽ;->ۧ:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Ll/ᩴ᩸ܽ;->֫(Ll/ᩴ᩸ܽ;Ljava/lang/String;Ljava/io/BufferedOutputStream;Ll/ۨۖܽ;)V

    return-void
.end method
