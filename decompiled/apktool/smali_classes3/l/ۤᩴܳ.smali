.class public final Ll/ۤᩴܳ;
.super Ljava/lang/Object;
.source "715M"


# static fields
.field public static final ᩳ:Ll/۫ᩴܳ;


# instance fields
.field public final ֫:Ll/ܽᩴܳ;

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 879
    new-instance v0, Ll/۫ᩴܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۤᩴܳ;->ᩳ:Ll/۫ᩴܳ;

    return-void
.end method

.method public constructor <init>(Ll/ܽᩴܳ;II)V
    .locals 0

    .line 890
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 891
    iput-object p1, p0, Ll/ۤᩴܳ;->֫:Ll/ܽᩴܳ;

    .line 892
    iput p2, p0, Ll/ۤᩴܳ;->ܽ:I

    .line 893
    iput p3, p0, Ll/ۤᩴܳ;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫()Ll/۫ᩴܳ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۤᩴܳ;->ᩳ:Ll/۫ᩴܳ;

    return-object v0
.end method
