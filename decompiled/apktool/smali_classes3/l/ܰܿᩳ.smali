.class public Ll/ܰܿᩳ;
.super Ljava/lang/Object;
.source "01W2"


# annotations
.annotation runtime Ll/᩸ᩳᩳ;
    type = .enum Ll/֫ܿᩳ;->ۨ:Ll/֫ܿᩳ;
.end annotation


# instance fields
.field public ֫:Ljava/nio/ByteBuffer;
    .annotation runtime Ll/ۨᩳᩳ;
        index = 0x1
        optional = true
        tagNumber = 0x0
        tagging = .enum Ll/۟ᩳᩳ;->᩹:Ll/۟ᩳᩳ;
        type = .enum Ll/֫ܿᩳ;->ۛ:Ll/֫ܿᩳ;
    .end annotation
.end field

.field public ۧ:Ljava/lang/String;
    .annotation runtime Ll/ۨᩳᩳ;
        index = 0x0
        type = .enum Ll/֫ܿᩳ;->ۤ:Ll/֫ܿᩳ;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/ܰܿᩳ;->ۧ:Ljava/lang/String;

    return-void
.end method
