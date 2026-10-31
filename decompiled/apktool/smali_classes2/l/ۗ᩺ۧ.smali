.class public Ll/ۗ᩺ۧ;
.super Ljava/lang/Object;
.source "W23P"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩸:Ll/ۛ᩺ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Ll/ۙ᩺ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۗ᩺ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ll/ۤ᩺ۧ;

    invoke-direct {v0, p1}, Ll/ۤ᩺ۧ;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v0}, Ll/۫᩺ۧ;->᩷()Ll/ۛ᩺ۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩺ۧ;->᩸:Ll/ۛ᩺ۧ;

    return-void
.end method

.method public constructor <init>(Ll/ۛ᩺ۧ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ۗ᩺ۧ;->᩸:Ll/ۛ᩺ۧ;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 56
    new-instance p2, Ll/ۤ᩺ۧ;

    invoke-direct {p2, p1}, Ll/ۤ᩺ۧ;-><init>(Landroid/os/Parcel;)V

    .line 57
    iget-object p1, p0, Ll/ۗ᩺ۧ;->᩸:Ll/ۛ᩺ۧ;

    invoke-virtual {p2, p1}, Ll/۫᩺ۧ;->ܽ(Ll/ۛ᩺ۧ;)V

    return-void
.end method

.method public final ֫()Ll/ۛ᩺ۧ;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۗ᩺ۧ;->᩸:Ll/ۛ᩺ۧ;

    return-object v0
.end method
